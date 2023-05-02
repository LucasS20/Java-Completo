package com.educandoWeb.course.model.repositories;

import com.educandoWeb.course.model.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
