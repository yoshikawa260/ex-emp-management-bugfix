package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // http.authorizeHttpRequests(customizer -> customizer
        //         // .requestMatchers("/api/auth").authenticated() // /api/authは認証が必要なページ
        //         .requestMatchers("/api/**").permitAll() // /api以下はすべて許可
        //         // .anyRequest().denyAll()); // その他のリクエストはすべて拒否
        // );
        return http.build();
    }
}