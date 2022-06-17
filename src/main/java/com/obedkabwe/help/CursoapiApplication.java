package com.obedkabwe.help;
import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.obedkabwe.help.domain.Categoria;
import com.obedkabwe.help.domain.Cidade;
import com.obedkabwe.help.domain.Cliente;
import com.obedkabwe.help.domain.Endereco;
import com.obedkabwe.help.domain.EnderecoRepository;
import com.obedkabwe.help.domain.Estado;
import com.obedkabwe.help.domain.Produto;
import com.obedkabwe.help.domain.ennums.TipoCliente;
import com.obedkabwe.help.repositories.CategoriaRepository;
import com.obedkabwe.help.repositories.CidadeRepository;
import com.obedkabwe.help.repositories.ClienteRepository;
import com.obedkabwe.help.repositories.EstadoRepository;
import com.obedkabwe.help.repositories.ProdutoRepository;


@SpringBootApplication
public class CursoapiApplication implements CommandLineRunner   {


	@Autowired
	CategoriaRepository categoriaRepository;
	@Autowired
	ProdutoRepository produtoRepository;
	@Autowired
	EstadoRepository estadoRepository;
	@Autowired
	CidadeRepository cidadeRepository;
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	EnderecoRepository enderecoRepository;
	
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
		
		
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "Sao Paulo");
		
		Cidade c1 = new Cidade(null, "Uberlandia");
		Cidade c2 = new Cidade(null, "Sao Paulo");
		Cidade c3 = new Cidade(null, "Campinas");
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2,c3));
		
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		
		
		Cliente cli1 = new Cliente(null, "Maria silva", "kabweobed@gmail.com", "283684794", TipoCliente.PESSOAFISICA);
		
		Endereco e1 = new Endereco(null, "Rua Flores", "22", "Apt 33", "jardim", "388483", cli1, c3);
		Endereco e2 = new Endereco(null, "Avenida oberson", "145", "Apt 88", "paulista", "287654", cli1, c3);
		
		
		cli1.getTelefones().addAll(Arrays.asList("254546657","898098"));
		cli1.getEnderocos().addAll(Arrays.asList(e1,e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1,e2));
		
		
		
		
		
	}

}
