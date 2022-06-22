package com.obedkabwe.help.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.obedkabwe.help.domain.Pagamento;


@Repository
public interface PagamentoRepository  extends JpaRepository<Pagamento, Integer> {

}
