package com.obedkabwe.help.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.obedkabwe.help.domain.Cliente;

import com.obedkabwe.help.repositories.ClienteRepository;
import com.obedkabwe.help.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	public ClienteRepository repository;
	
	public Cliente findById(Integer id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! Id: " + id + ",Tipo: " + Cliente.class.getName()));
				
	
	
	
	
	
	
	
	
	
	}
	
	
}
