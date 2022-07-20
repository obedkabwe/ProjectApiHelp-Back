package com.obedkabwe.help.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obedkabwe.help.domain.Pedido;
import com.obedkabwe.help.repositories.PedidoRepository;
import com.obedkabwe.help.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	public PedidoRepository repository;
	
	public Pedido findById(Integer id) {
		Optional<Pedido> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! Id: " + id + ",Tipo: " + Pedido.class.getName()));
				
	
	
	
	
	
	
	
	
	
	}
	
	
}
