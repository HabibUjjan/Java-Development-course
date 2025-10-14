package com.student.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.student.dao", "com.student.daoimpl", "com.student.database", "com.student.model"})
public class AppConfig {

}
