package com.relacionamento.estadocidade.estadocidade.repositories;

import com.relacionamento.estadocidade.estadocidade.models.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICidadeRepository extends JpaRepository<Cidade, Integer> {
}
