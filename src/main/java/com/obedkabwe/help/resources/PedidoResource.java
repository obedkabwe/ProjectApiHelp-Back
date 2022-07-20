package com.obedkabwe.help.resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.obedkabwe.help.domain.Pedido;
import com.obedkabwe.help.services.PedidoService;


@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	@Autowired
	public PedidoService service;

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<Pedido> findById (@PathVariable Integer id) {
		Pedido obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
		
		
		
		
//		List<Pedido> lista = new ArrayList<>();
//		
//		Pedido cat1 = new Pedido(1, "informatica");
//		Pedido cat2 = new Pedido(2, "escritorio");
//		
//		lista.add(cat1);
//		lista.add(cat2);
//		
//		return lista;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
