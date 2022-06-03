package com.obedkabwe.help;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.obedkabwe.help.domain.Categoria;
import com.obedkabwe.help.domain.Produto;
import com.obedkabwe.help.repositories.CategoriaRepository;
import com.obedkabwe.help.repositories.ProdutoRepository;


@SpringBootApplication
public class CursoapiApplication implements CommandLineRunner   {


	@Autowired
	CategoriaRepository categoriaRepository;
	@Autowired
	ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Categoria cat1 = new Categoria("informatica");
		Categoria cat2 = new Categoria("escritorio"); 
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null,"impressora", 800.00);
		Produto p3 = new Produto(null, "mouse", 80.00);
		
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
