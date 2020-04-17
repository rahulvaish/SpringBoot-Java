package com.security.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
    @Override
    protected void configure(HttpSecurity http) throws Exception 
    {
    	 http
         //HTTP Basic authentication
         .httpBasic()
         .and()
         .authorizeRequests()
         .antMatchers(HttpMethod.GET, "/library/books/").hasRole("ADMIN")
         .antMatchers(HttpMethod.GET, "/library/books/").hasRole("USER")
         .antMatchers(HttpMethod.GET, "/library/").hasRole("ADMIN")
         .and()
         .csrf().disable()
         .formLogin().disable();
    	 
    }
    
 
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) 
            throws Exception 
    {
    	auth.inMemoryAuthentication()
        .withUser("user").password("{noop}password").roles("USER")
        .and()
        .withUser("admin").password("{noop}password").roles("USER", "ADMIN");
    }
}