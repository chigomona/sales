package com.eshop.sales.config;

import com.eshop.sales.interceptor.VisitorSignInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class VisitorSignConfigurer implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new VisitorSignInterceptor())
                .addPathPatterns("/**") // 拦截所有请求，包括静态资源文件
                .excludePathPatterns("/visitorsign", "/welcomevisitor", "/error", "/lib/**", "/css/**",
                        "/images/**", "/js/**"); // 放行登录页、error页、静态资源
    }
}
