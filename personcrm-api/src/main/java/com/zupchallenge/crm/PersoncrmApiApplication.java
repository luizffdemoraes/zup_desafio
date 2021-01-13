package com.zupchallenge.crm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PersoncrmApiApplication {
	
	/**
	 @Bean
	public CommandLineRunner runner(@Autowired ClienteRepository repository) {
		return args -> {
			Cliente cliente = Cliente.builder()
					.cpf("00000000000")
					.nome("fulano")
					.email("teste@gmail.com")
					.build();
			
			
			repository.save(cliente);
			
		};
	}
	 */
	

	public static void main(String[] args) {
		SpringApplication.run(PersoncrmApiApplication.class, args);
	}

}
