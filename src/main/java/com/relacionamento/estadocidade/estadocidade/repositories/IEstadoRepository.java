package com.relacionamento.estadocidade.estadocidade.repositories;

import com.relacionamento.estadocidade.estadocidade.models.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadoRepository extends JpaRepository<Estado, Integer> {
}
