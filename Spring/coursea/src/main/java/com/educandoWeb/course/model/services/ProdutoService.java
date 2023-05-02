package com.educandoWeb.course.model.services;

import com.educandoWeb.course.model.repositories.ProdutoRepository;
import com.educandoWeb.course.model.entities.Produto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository repo;

    public ProdutoService(ProdutoRepository repo) {
        this.repo = repo;
    }

    public List<Produto> findAll() {
        return repo.findAll();
    }

    public Produto findById(Long id) {
        Optional<Produto> obj = repo.findById(id);
        return obj.get();
    }
}
