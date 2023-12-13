package com.group.hotelApi.controller;


import com.group.hotelApi.entities.Habitacion;
import com.group.hotelApi.services.HabitacionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/habitaciones")
@AllArgsConstructor
public class HabitacionController {

    private HabitacionService habitacionService;

    @GetMapping()
    private List<Habitacion> listarHabitaciones(){
        return habitacionService.listarHabitaciones();
    }

    @GetMapping("/{idHabitacion}")
    private Habitacion listarHabitaciones(@PathVariable Integer idHabitacion){
        return habitacionService.buscarHabitacion(idHabitacion);
    }
    @PostMapping("/crear")
    private Habitacion crearHabitacion(@RequestBody Habitacion habitacion){
        return habitacionService.crearHabitacion(habitacion);
    }
}
