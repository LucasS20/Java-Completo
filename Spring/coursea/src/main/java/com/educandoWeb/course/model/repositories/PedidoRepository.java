package com.educandoWeb.course.model.repositories;

import com.educandoWeb.course.model.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
