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

    @Override
    public Cliente findCliente(Integer idCliente) {
        return clienteRepository.findById(idCliente).get();
    }

    @Override
    public Cliente editClient(Integer idCliente, Cliente cliente) {

        Cliente clienteActualizado=clienteRepository.findById(idCliente)
                .orElseThrow(()->new RuntimeException("cliente no encontrado con el id :"+idCliente));

        clienteActualizado.setNombre(cliente.getNombre());
        clienteActualizado.setApellido(cliente.getApellido());
        clienteActualizado.setEmail(cliente.getEmail());
        clienteActualizado.setTelefono(cliente.getTelefono());
        clienteActualizado.setFecNaci(cliente.getFecNaci());
        clienteRepository.save(clienteActualizado);
        return clienteActualizado;
    }

    @Override
    public void deleteClient(Integer idCliente) {
        Cliente clienteActualizado=clienteRepository.findById(idCliente)
                .orElseThrow(()->new RuntimeException("cliente no encontrado con el id :"+idCliente));
         clienteRepository.deleteById(clienteActualizado.getIdCliente());
    }
}
