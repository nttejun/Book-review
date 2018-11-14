package com.example.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class TodoSecurityConfig extends WebSecurityConfigurerAdapter {


    protected void configure(HttpSecurity http) throws Exception {
        http.securityContext()
                .and()
                .servletApi();
        /*
                .and()
                .exceptionHandling()
                .and()
                .formLogin().loginPage("/login.jsp")
                .defaultSuccessUrl("/todos")
                .failureUrl("login.jsp?error=true");
                */
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
               .withUser("marten@ya2do.io").password("user").authorities("USER")
                .and()
                .withUser("admin@ya2do.io").password("admin").authorities("USER", "ADMIN");
    }

    // Override 사용하여 USER 권한부여
    /***
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                // antMatchers : 유저가 어떤 권한을 가져야 하는지 권한 매치
                .antMatchers("/todos*").hasAnyAuthority("USER")
                .antMatchers(HttpMethod.DELETE, "/todos").hasAnyAuthority("ADMIN")
                .and()
                    .formLogin()
                .and()
                .csrf().disable();
    }
    */

    // HTTP 기본 로그인 인증 폼 실행
    /***
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin().and()
                .httpBasic();
    }
    */

}
