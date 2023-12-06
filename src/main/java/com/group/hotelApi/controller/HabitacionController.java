package com.group.hotelApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habitacion")
public class HabitacionController {

	@GetMapping
	public void envio() {
		System.out.println("Verb HTTP");
	}
}
