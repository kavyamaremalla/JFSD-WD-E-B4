package com.demo.todo.management.config;

import com.demo.todo.management.security.JWTTokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableMethodSecurity
public class SpringSecurityConfig {

    @Autowired
    private JWTTokenFilter jwtTokenFilter;

    @Bean
    public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

/*        httpSecurity.csrf().disable()
                .authorizeHttpRequests((authorize) -> {
                    authorize.anyRequest().authenticated();
//                    authorize.requestMatchers(HttpMethod.GET, "api/**").hasAnyRole("ADMIN","USER");
//                    authorize.requestMatchers(HttpMethod.POST, "api/**").hasRole("ADMIN");
                })
                .httpBasic(Customizer.withDefaults());*/

        httpSecurity.csrf().disable().authorizeHttpRequests()
                .requestMatchers(HttpMethod.POST, "api/todos/jwt").permitAll()
                .anyRequest().authenticated()
                .and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        httpSecurity.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);

        return httpSecurity.build();
    }

//    @Bean
//    public UserDetailsService userDetailsService(){
//        UserDetails john = User.builder().username("john")
//                .password(passwordEncoder().encode("John@123")).roles("USER").build();
//
//        UserDetails admin = User.builder().username("admin")
//                .password(passwordEncoder().encode("Admin@456")).roles("ADMIN").build();
//
//        return new InMemoryUserDetailsManager(john, admin);
//    }

//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
//        return configuration.getAuthenticationManager();
//    }
}
