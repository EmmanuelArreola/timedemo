package com.cloud.n3xgen.timedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

@SpringBootApplication
public class TimedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimedemoApplication.class, args);
	}

}
