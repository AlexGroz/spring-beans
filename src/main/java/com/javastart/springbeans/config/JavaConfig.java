package com.javastart.springbeans.config;

import com.javastart.springbeans.service.JavaConfigService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.OffsetDateTime;

@Configuration
public class JavaConfig {

    @Bean
    public JavaConfigService javaConfigService(){
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        JavaConfigService javaConfigService = new JavaConfigService(offsetDateTime.toString());
        javaConfigService.setDayOfMonth(offsetDateTime.getDayOfMonth());
        return javaConfigService;
    }

    @Bean
    public JavaConfigService javaConfigService1(){
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        return new JavaConfigService(offsetDateTime.toString());
    }
}
