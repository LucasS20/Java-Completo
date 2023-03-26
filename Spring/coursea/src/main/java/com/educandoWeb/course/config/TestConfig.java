package com.educandoWeb.course.config;

import com.educandoWeb.course.entities.Pedido;
import com.educandoWeb.course.entities.User;
import com.educandoWeb.course.entities.enums.StatusPedido;
import com.educandoWeb.course.repositories.PedidoRepository;
import com.educandoWeb.course.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration

@Profile("test")
public class TestConfig implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PedidoRepository pedidoRepository;

    public TestConfig(UserRepository userRepository, PedidoRepository pedidoRepository) {
        this.userRepository = userRepository;
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public void run(String... args) {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), StatusPedido.PAGO, u1);
        Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), StatusPedido.ESPERANDO_PAGAMENTO, u2);
        Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), StatusPedido.ESPERANDO_PAGAMENTO, u1);
        userRepository.saveAll(Arrays.asList(u1, u2));
        pedidoRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
