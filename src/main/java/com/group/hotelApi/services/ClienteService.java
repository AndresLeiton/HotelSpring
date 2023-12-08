package com.group.hotelApi.services;

import com.group.hotelApi.entities.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {

    List<Cliente> listCliente();
    Cliente crearCliente(Cliente cliente);
}
