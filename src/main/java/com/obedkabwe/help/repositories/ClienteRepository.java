package com.obedkabwe.help.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obedkabwe.help.domain.Cliente;


public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

}
