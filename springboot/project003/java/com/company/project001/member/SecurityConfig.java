package com.company.project001.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.company.project001.oauth.PrincipleOauth2UserService;
import com.company.project001.util.JwtTokenFilter;
import com.company.project001.util.JwtUtil;
 
@Configuration      // 스프링부트 환경설정팡리
@EnableWebSecurity  // url 스프링시큐리티 제어 - SecurityFilterChain
public class SecurityConfig {
	//1. url
	@Autowired PrincipleOauth2UserService  principalOauth2UserService;
	
	@Autowired JwtUtil jwtUtil;	// jwt 토큰발급	1##
	
	@Bean SecurityFilterChain filterChain(HttpSecurity http, MemberService memberService) throws Exception {
		
		JwtTokenFilter jwtTokenFilter = new JwtTokenFilter(memberService, jwtUtil);
		
		http
		.csrf().disable() // 개발용(보호기능 비활성화) 개발 환경에선 임시로 disable 가능
		.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)	// 세션필요할때만
		.and()
		.authorizeRequests()
		.antMatchers("/api/member/login", "/api/member/join").permitAll()	// mobile - jwt
	    .antMatchers("/member/login", "/member/join", "/resources/**").permitAll()	// pc - security
	    .antMatchers("/board/insert", "/board/update/**", "/board/delete/**", "/member/member").authenticated()
	    .anyRequest().permitAll()
	    .and()
	    .formLogin()
	        .loginPage("/member/login")
	        .loginProcessingUrl("/member/login")
	        .defaultSuccessUrl("/member/member", true)
	        .failureUrl("/member/login?error=true")
	    .and()
	    .logout()
	        .logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
	        .logoutSuccessUrl("/member/login")
	        .invalidateHttpSession(true)
	    .and()
	    .oauth2Login()	// oauth2 - kakao, naver, google
	        .loginPage("/member/login")
	        .defaultSuccessUrl("/member/member")
	        .userInfoEndpoint()
	        .userService(principalOauth2UserService)
	        .and()
	        .and()
	    .exceptionHandling()
	    	.authenticationEntryPoint((request, response, authException)-> {
	    		if(!request.getRequestURI().startsWith("/api/")) {	//pc
	    			response.sendRedirect("/member/login?error=true");
	    		} else{	// mobile
	    			response.setStatus(401);	// 인증되지 않았어...누구세요?로그인부터		400: 잘못된 parameter
	    			response.setContentType("application/json");
	    			response.getWriter().write("{\"error\":\"Unauthorized\"}");	// {"error":"Unauthorized"}
	    		}
	    	})
	    	.accessDeniedHandler((request, response, authException)-> {
	    		if(!request.getRequestURI().startsWith("/api/")) {	//pc
	    			response.sendRedirect("/member/login?error=true");
	    		} else{	// mobile
	    			response.setStatus(403);	// 인증이 되었지만 접근권한없어 : 일반이 관리자페이지
	    			response.setContentType("application/json");
	    			response.getWriter().write("{\"error\":\"Unauthorized\"}");	// {"error":"Unauthorized"}
	    		}
	    	});
//	    .csrf(csrf -> csrf
//	    	    .ignoringRequestMatchers(
//	    	        new AntPathRequestMatcher("/member/join", "POST"),
//	    	        new AntPathRequestMatcher("/board/insert", "POST"),
//	    	        new AntPathRequestMatcher("/board/update/**", "POST"),
//	    	        new AntPathRequestMatcher("/board/delete/**", "POST")
//	    	    )
//	     );
		http.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);
		//##
		
	    return http.build();
	}

	
	//2. AuthenticationManager - 사용자인증시 Service와 PasswordEncoder를 사용함.
	@Bean AuthenticationManager   authenticationManager(AuthenticationConfiguration  authenticationConfiguration) throws Exception{  
		return authenticationConfiguration.getAuthenticationManager();
	}
	
//	//3. PasswordEncoder - 비번암호화
//	@Bean PasswordEncoder  passwordEncoder() { 
//		return new  BCryptPasswordEncoder(); 
//	}
} 



// Bean - 스크링이 관리하는 객체
/*
	.oauth2Login(oauth2 -> oauth2
                .userInfoEndpoint(userInfo -> userInfo
                    .userService(oauth2LoginService) // OAuth2UserService 등록
                )
         );  
*/