package br.com.springboot.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * Spring Boot application starter class
 */
@EntityScan(basePackages = "br.com.springboot.model")
@SpringBootApplication
@EnableJpaRepositories(basePackages = { "br.com.springboot.repository" })
public class Application {
	
    public static void main(String[] args) {
    	
        SpringApplication.run(Application.class, args);/**linha principal que roda o projeto java spring boot **/
    }
}
