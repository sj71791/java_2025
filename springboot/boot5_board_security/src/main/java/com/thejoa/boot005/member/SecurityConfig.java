package com.thejoa.boot005.member;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration //스프링부트 환경설정관리
@EnableWebSecurity //url 스프링시큐리티 제어 - securityFilterChain
public class SecurityConfig {
	//1. url
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		// 1-0. http.authorizeHttpRequests().formLogin().logout();
		// 1-1. 로그인을 안하더라도 모든페이지 접근가능
		//		/admin/**	, /user/**,,,
		http.authorizeHttpRequests(
				(authorizeHttpRequests) -> authorizeHttpRequests
											// admin만 접근가능
											//.requestMatchers(new AntPathRequestMatcher("/admin/**"))
											//.hasRole("ROLE_ADMIN")	//ADMIN 역할
											//member만 접근가능
											//.requestMatchers(new AntPathRequestMatcher("/member/**"))
											//.hasRole("ROLE_MEMBER")	//ADMIN 역할
											//기타페이지 모두 접근 가능(로그인필요없음)
											.requestMatchers(new AntPathRequestMatcher("/**"))
											.permitAll() //모든사용자 접근가능
		).formLogin( //1-2. form 만든폼 - login
				(formLogin)-> formLogin
								.loginPage("/member/login")
								.defaultSuccessUrl("/member/member")
		).logout( //1-3. logout
				(logout)-> logout
							.logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
							.logoutSuccessUrl("/member/login")
							.invalidateHttpSession(true)
		);
		return http.build();
		
	}
	
	//2. authenticationManager - 사용자인증시 service와 PassWordEncoder를 사용함.
	@Bean
	AuthenticationManager authenticationManager(
			AuthenticationConfiguration authenticationConfiguration
	) throws Exception{
		return authenticationConfiguration.getAuthenticationManager();
	}
	
	//3. PasswordEncoder - 비번암호화
	@Bean PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder(); }
}

// Bean - 스프링이 관리하는 객체
