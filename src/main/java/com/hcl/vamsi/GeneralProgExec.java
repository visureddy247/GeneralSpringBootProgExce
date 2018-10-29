package com.hcl.vamsi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * update the weather service to read API key from application.properties file.
 * need to implement to host a service which will receive a json input on post.
 * need to implement @bean annotation and inject in the controller class.
 * DAO class implementation
 * @author Vamsi.Kallam
 *
 */
@SpringBootApplication
@EnableAutoConfiguration

public class GeneralProgExec {
	public static void main(String[] args) {
		SpringApplication.run(GeneralProgExec.class, args);
		
	}
}
