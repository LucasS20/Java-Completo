package com.educandoWeb.course.repositories;

import com.educandoWeb.course.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
