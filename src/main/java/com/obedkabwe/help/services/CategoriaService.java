package com.obedkabwe.help.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obedkabwe.help.domain.Categoria;
import com.obedkabwe.help.repositories.CategoriaRepository;
import com.obedkabwe.help.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	public CategoriaRepository repository;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! Id: " + id + ",Tipo: " + Categoria.class.getName()));
				
	
	
	
	
	
	
	
	
	
	}
	
	
}
