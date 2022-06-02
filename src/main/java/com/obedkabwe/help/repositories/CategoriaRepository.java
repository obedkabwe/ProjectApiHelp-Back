package com.obedkabwe.help.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obedkabwe.help.domain.Categoria;


@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Integer> {

}
