package com.group.hotelApi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")

public class ClienteController {

    @PostMapping
    public void registroUsuario(){
        System.out.println("el request llega correctamente");
    }

}