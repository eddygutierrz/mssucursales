package com.impulsofirme.mssucursales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.impulsofirme.mssucursales.config.JwtProperties;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EnableConfigurationProperties(JwtProperties.class)
public class MssucursalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MssucursalesApplication.class, args);
	}

}
