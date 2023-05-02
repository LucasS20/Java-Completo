package com.educandoWeb.course.model.services;

import com.educandoWeb.course.model.repositories.PedidoRepository;
import com.educandoWeb.course.model.entities.Pedido;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    private final PedidoRepository repo;


    public PedidoService(PedidoRepository repo) {
        this.repo = repo;
    }

    public List<Pedido> findAll() {
        return repo.findAll();
    }

    public Pedido findById(Long id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.get();
    }
}
