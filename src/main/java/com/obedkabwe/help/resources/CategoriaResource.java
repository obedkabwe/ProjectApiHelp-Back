package com.obedkabwe.help.resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.obedkabwe.help.domain.Categoria;
import com.obedkabwe.help.services.CategoriaService;


@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	@Autowired
	public CategoriaService service;

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<Categoria> findById (@PathVariable Integer id) {
		Categoria obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
		
		
		
		
//		List<Categoria> lista = new ArrayList<>();
//		
//		Categoria cat1 = new Categoria(1, "informatica");
//		Categoria cat2 = new Categoria(2, "escritorio");
//		
//		lista.add(cat1);
//		lista.add(cat2);
//		
//		return lista;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
