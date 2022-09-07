package com.obedkabwe.help.resources;
import java.net.URI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
		
		}
		
		
		
		
//		List<Categoria> lista = new ArrayList<>();
//		
//		Categoria cat1 = new Categoria(1, "informatica");
//		Categoria cat2 = new Categoria(2, "escritorio");
//		
//		lista.add(cat1);
//		lista.add(cat2);
//		
//		return lista;
		
	

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert ( @RequestBody  Categoria obj){
		
		 obj = service.insert(obj);
	
	    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
	   return ResponseEntity.created(uri).build();
	}
	
	
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> find (@RequestBody Categoria obj, @PathVariable Integer id){
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Categoria> delete( @PathVariable Integer id){
		 service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
	
	
	
	
}
