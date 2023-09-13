package br.com.projeto.barbosa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan
public class BarbosaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarbosaApplication.class, args);
	}

}
