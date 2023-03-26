package com.educandoWeb.course.entities.enums;

import java.util.Arrays;

public enum StatusPedido {
    ESPERANDO_PAGAMENTO(1),
    PAGO(2),
    ENVIADO(3),
    ENTREGUE(4),
    CANCELADO(5);

    private Integer codigo;

    private StatusPedido(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static StatusPedido valueOf(int code) {
        for (StatusPedido valor : StatusPedido.values()) {
            if (valor.getCodigo() == code) return valor;
        }
        throw new IllegalArgumentException("Codigo de Status do pedido Invalido");
    }
}
