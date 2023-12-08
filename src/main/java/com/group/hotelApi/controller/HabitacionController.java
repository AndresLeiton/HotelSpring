package com.group.hotelApi.controller;

import com.group.hotelApi.entities.Habitacion;
import com.group.hotelApi.services.HabitacionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/habitaciones")
@AllArgsConstructor
public class HabitacionController {
    private HabitacionService habitacionService;
    @GetMapping
    public List<Habitacion> listarHabitaciones(){
        return habitacionService.listarHabitaciones();
    }
}
