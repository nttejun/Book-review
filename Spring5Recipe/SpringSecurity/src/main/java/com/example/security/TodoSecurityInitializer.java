package com.example.security;

import com.example.security.config.TodoSecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Configuration
public class TodoSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    public TodoSecurityInitializer(){
        super(TodoSecurityConfig.class);
    }
}
