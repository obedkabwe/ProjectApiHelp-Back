package com.obedkabwe.help;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.obedkabwe.help.domain.Categoria;
import com.obedkabwe.help.repositories.CategoriaRepository;


@SpringBootApplication
public class CursoapiApplication implements CommandLineRunner   {


	@Autowired
	CategoriaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Categoria cat1 = new Categoria("informatica");
		Categoria cat2 = new Categoria("escritorio"); 
		repository.saveAll(Arrays.asList(cat1,cat2));
		
		
		
	}

}
