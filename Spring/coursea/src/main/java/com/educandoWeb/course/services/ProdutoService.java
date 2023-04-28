package com.educandoWeb.course.services;

import com.educandoWeb.course.entities.Produto;
import com.educandoWeb.course.repositories.ProdutoRepository;
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
