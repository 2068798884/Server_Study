package server.study.api.api_demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            // ⚠️ 关键：关闭 CSRF 防护（否则 POST 请求会被拦截报 403）
            .csrf { it.disable() }
            
            // 配置请求授权规则
            .authorizeHttpRequests { auth ->
                // 暂时全部放行，看看请求能不能进 Controller
                auth.anyRequest().permitAll() 
            }
            
        return http.build()
    }
}