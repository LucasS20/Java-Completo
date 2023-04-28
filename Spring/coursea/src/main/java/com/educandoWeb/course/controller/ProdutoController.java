package com.educandoWeb.course.controller;

import com.educandoWeb.course.entities.Produto;
import com.educandoWeb.course.services.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> findAll() {
        List<Produto> listaProdutos = service.findAll();
        return ResponseEntity.ok().body(listaProdutos);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }
}
