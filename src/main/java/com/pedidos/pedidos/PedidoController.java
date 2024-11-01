package com.pedidos.pedidos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.pedidos.pedidos.dto.UserDto;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private UserClient userClient;

    private List<PedidoModel> pedidos = new ArrayList<>();

    @PostMapping("/criar")
    public PedidoModel criarPedido(@RequestBody PedidoModel pedido) {
     
        UserDto user = userClient.getUserById(pedido.getUserId());
        if (user == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");

      
        pedidos.add(pedido);
        return pedido;
    }

    @GetMapping
    public List<PedidoModel> getAllpedidos() {
        return pedidos;
    }
}
