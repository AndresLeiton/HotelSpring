package com.group.hotelApi.services.imp;

import com.group.hotelApi.entities.Cliente;
import com.group.hotelApi.repository.ClienteRepository;
import com.group.hotelApi.services.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> listCliente() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
