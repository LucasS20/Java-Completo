package com.educandoWeb.course.services;

import com.educandoWeb.course.entities.Pedido;
import com.educandoWeb.course.entities.User;
import com.educandoWeb.course.repositories.PedidoRepository;
import com.educandoWeb.course.repositories.UserRepository;
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
