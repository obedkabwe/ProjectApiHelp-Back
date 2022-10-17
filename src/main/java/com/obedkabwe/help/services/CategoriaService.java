package com.obedkabwe.help.services;



import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.obedkabwe.help.domain.Categoria;
import com.obedkabwe.help.repositories.CategoriaRepository;
import com.obedkabwe.help.services.exception.DataIntegretyException;
import com.obedkabwe.help.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	public CategoriaRepository repository;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! Id: " + id + ",Tipo: " + Categoria.class.getName()));		
	
	}

	public Categoria insert (Categoria obj) {
		obj.setId(0);
		return repository.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		obj.setId(0);
		return repository.save(obj);
	}
	
	
	public void delete(Integer id) {
		findById(id);
		try {
		repository.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegretyException("No posiible to delete category who has a products");
		}
	
	}
	
	
	
	public List<Categoria> findAll(){
		return repository.findAll();
	}
	
	
	
	
	
	
	
}
