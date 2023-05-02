package com.educandoWeb.course.model.services;

import com.educandoWeb.course.model.repositories.CategoriaRepository;
import com.educandoWeb.course.model.entities.Categoria;
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
