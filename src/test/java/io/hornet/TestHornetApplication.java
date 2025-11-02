package io.hornet;

import org.springframework.boot.SpringApplication;

public class TestHornetApplication {

	public static void main(String[] args) {
		SpringApplication.from(HornetApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
