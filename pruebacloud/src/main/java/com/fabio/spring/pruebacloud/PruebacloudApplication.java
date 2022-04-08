package com.fabio.spring.pruebacloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PruebacloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebacloudApplication.class, args);
	}

}
