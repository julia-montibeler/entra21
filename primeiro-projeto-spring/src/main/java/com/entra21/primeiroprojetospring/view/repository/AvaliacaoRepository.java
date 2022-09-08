package com.entra21.primeiroprojetospring.view.repository;

import com.entra21.primeiroprojetospring.model.entity.AvaliacaoEntity;
import com.entra21.primeiroprojetospring.model.entity.DvdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends JpaRepository<AvaliacaoEntity, Long> {
}
