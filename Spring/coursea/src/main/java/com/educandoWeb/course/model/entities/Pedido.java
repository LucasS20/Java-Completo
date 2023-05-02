package com.educandoWeb.course.model.entities;

import com.educandoWeb.course.model.entities.enums.StatusPedido;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table

public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T' HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;
    private Integer statusPedido;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private User cliente;
    @OneToMany(mappedBy = "id.pedido")
    private final Set<ItemPedido> itens = new HashSet<>();

    public Pedido(Instant moment, StatusPedido statusPedido, User cliente) {
        this.moment = moment;
        setStatusPedido(statusPedido);
        this.cliente = cliente;
    }


    public StatusPedido getStatusPedido() {
        return StatusPedido.valueOf(statusPedido);
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        if (statusPedido != null)
            this.statusPedido = statusPedido.getCodigo();
    }

}
