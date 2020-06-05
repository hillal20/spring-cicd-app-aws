package cicdjavaspringaws.cicdjavaspringaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CicdJavaSpringAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdJavaSpringAwsApplication.class, args);

		System.out.println(" ====== CICD SPRING AWS IS RUNNING === ");
	}



}
