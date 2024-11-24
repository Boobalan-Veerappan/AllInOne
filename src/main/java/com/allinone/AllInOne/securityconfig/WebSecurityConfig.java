package com.allinone.AllInOne.securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecurityConfig {

    @Configuration
    public static class ResourceServerSecurityConfiguration {
        JwtDecoder jwtDecoder;
        @Autowired
        public ResourceServerSecurityConfiguration(JwtDecoder decoratedJwtDecoder) {
            this.jwtDecoder = decoratedJwtDecoder;
        }

        @Bean
        @Order(10)
        public SecurityFilterChain resourceServerSecurityFilterChain(HttpSecurity http) throws Exception {

//            http.authorizeRequests()
//                    .anyRequest().authenticated()
//                    .and()
//                    .sessionManagement(sessionManagement ->
//                            sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                    .oauth2ResourceServer(oauth2ResourceServer -> {
//                        oauth2ResourceServer.jwt(jwt -> {
//                            jwt.decoder(jwtDecoder);
//                        });
//                    });
            return http.build();
        }

    }

}
