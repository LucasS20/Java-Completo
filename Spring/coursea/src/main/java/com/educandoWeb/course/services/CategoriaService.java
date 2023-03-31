package com.educandoWeb.course.services;

import com.educandoWeb.course.entities.Categoria;
import com.educandoWeb.course.entities.Pedido;
import com.educandoWeb.course.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    private final CategoriaRepository repo;

    public CategoriaService(CategoriaRepository repo) {
        this.repo = repo;
    }

    public List<Categoria> findAll() {
        return repo.findAll();
    }

    public Categoria findById(Long id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.get();
    }
}
