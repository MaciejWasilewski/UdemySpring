package com.example.mw.springPureJavaDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.mw")
@PropertySource("classpath:data.properties")
public class SpringConfig {

}
