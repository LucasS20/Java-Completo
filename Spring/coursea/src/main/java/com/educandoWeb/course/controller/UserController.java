package com.educandoWeb.course.controller;

import com.educandoWeb.course.model.entities.User;
import com.educandoWeb.course.model.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> listaUsuarios = service.findAll();
        return ResponseEntity.ok().body(listaUsuarios);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping //inserir coisas
    public ResponseEntity<User> inserir(@RequestBody User user) {
        user = service.insert(user);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uri).body(user);//retorna 201
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> atualizar(@PathVariable Long id, @RequestBody User usuario) {
        usuario = service.update(id, usuario);
        return ResponseEntity.ok().body(usuario);
    }
}
