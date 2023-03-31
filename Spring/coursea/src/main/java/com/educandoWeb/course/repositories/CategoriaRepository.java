package com.educandoWeb.course.repositories;

import com.educandoWeb.course.entities.Categoria;
import com.educandoWeb.course.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
