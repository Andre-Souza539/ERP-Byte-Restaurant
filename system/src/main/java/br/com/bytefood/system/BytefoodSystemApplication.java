package br.com.bytefood.system;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.bytefood.orm.UserRoles;

@SpringBootApplication
public class BytefoodSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BytefoodSystemApplication.class, args);
		UserRoles.gerarRoles();
		
	}

}
