package com.educandoWeb.course.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "tb_produto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private Double preco;

    @Column
    private String url;

    @ManyToMany
    @JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private final Set<Categoria> categorias = new HashSet<>();

    @OneToMany(mappedBy = "id.produto")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private final Set<ItemPedido> pedidos = new HashSet<>();

    @JsonIgnore
    public Set<Pedido> getPedidos() {
        return pedidos.stream().map(ItemPedido::getPedido).collect(Collectors.toSet());
    }
}
