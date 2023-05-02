package com.educandoWeb.course.model.repositories;

import com.educandoWeb.course.model.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
