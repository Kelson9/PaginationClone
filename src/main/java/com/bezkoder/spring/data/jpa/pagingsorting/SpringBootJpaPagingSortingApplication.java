package com.bezkoder.spring.data.jpa.pagingsorting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootJpaPagingSortingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaPagingSortingApplication.class, args);
	}

}
