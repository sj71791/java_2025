package com.company.project001.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.company.project001.oauth.PrincipleOauth2UserService;
 
 

@Configuration      // 스프링부트 환경설정팡리
@EnableWebSecurity  // url 스프링시큐리티 제어 - SecurityFilterChain
public class SecurityConfig {
	@Autowired PrincipleOauth2UserService  principalOauth2UserService;
	
    //1. url
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.authorizeRequests()
	    .antMatchers("/member/login", "/member/join", "/resources/**").permitAll()
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
	    .oauth2Login()
	        .loginPage("/member/login")
	        .defaultSuccessUrl("/member/member")
	        .userInfoEndpoint()
	        .userService(principalOauth2UserService)
	    .and()
	    .and()
	    //.csrf().disable(); // 개발 환경에선 임시로 disable 가능
	    .csrf(csrf -> csrf
	    	    .ignoringRequestMatchers(
	    	        new AntPathRequestMatcher("/member/join", "POST"),
	    	        new AntPathRequestMatcher("/board/insert", "POST"),
	    	        new AntPathRequestMatcher("/board/update/**", "POST"),
	    	        new AntPathRequestMatcher("/board/delete/**", "POST")
	    	    )
	     );

	    return http.build();
	}

	
	//2. AuthenticationManager - 사용자인증시 Service와 PasswordEncoder를 사용함.
	@Bean AuthenticationManager   authenticationManager(AuthenticationConfiguration  authenticationConfiguration) throws Exception{  
		return authenticationConfiguration.getAuthenticationManager();
	}
	
	//3. PasswordEncoder - 비번암호화
	@Bean  	PasswordEncoder  passwordEncoder() { return new  BCryptPasswordEncoder(); }
} 



// Bean - 스크링이 관리하는 객체
/*
	.oauth2Login(oauth2 -> oauth2
                .userInfoEndpoint(userInfo -> userInfo
                    .userService(oauth2LoginService) // OAuth2UserService 등록
                )
         );  
*/