package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

    import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

 
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootConfiguration
public class SpringEmployee1Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployee1Application.class, args);
	}
	@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

 
return application.sources(SpringEmployeeApplication.class);

 
}

}
