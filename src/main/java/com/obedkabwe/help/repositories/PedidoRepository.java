package com.obedkabwe.help.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obedkabwe.help.domain.Pedido;



@Repository
public interface PedidoRepository  extends JpaRepository<Pedido, Integer> {

}
