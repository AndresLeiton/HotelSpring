package com.group.hotelApi.controller;

import com.group.hotelApi.entities.Cliente;
import com.group.hotelApi.services.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/clientes")
@AllArgsConstructor
public class ClienteController {

    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarClientes(){
        return clienteService.listCliente();
    }

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return clienteService.crearCliente(cliente);
    }

    @GetMapping("/{idCliente}")
    public Cliente buscarCliente(@PathVariable Integer idCliente){
        return clienteService.findCliente(idCliente);
    }

    @PutMapping("/editar/{idCliente}")
    public Cliente editarCliente(@PathVariable Integer idCliente,@RequestBody Cliente cliente){
        return clienteService.editClient(idCliente, cliente);
    }

    @DeleteMapping("/eliminar/{idCliente}")
    public ResponseEntity<?> eliminarCliente(@PathVariable Integer idCliente){
        Map<Object, Object> resp= new HashMap<>();
        clienteService.deleteClient(idCliente);
        resp.put("mensaje","se elimino el cliente con el id "+ idCliente);
        return new ResponseEntity<>(resp, HttpStatus.ACCEPTED);
    }



}
