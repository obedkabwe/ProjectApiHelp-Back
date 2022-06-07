package com.obedkabwe.help.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obedkabwe.help.domain.Cidade;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
