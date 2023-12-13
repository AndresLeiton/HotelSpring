package com.group.hotelApi.services;

import com.group.hotelApi.entities.Habitacion;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HabitacionService {

     List<Habitacion> listarHabitaciones();
     Habitacion buscarHabitacion(Integer idHabitacion);
     Habitacion crearHabitacion(Habitacion habitacion);
     Habitacion editarHabitacion(Integer idHabitacion,Habitacion habitacion);
     void eliminarHabitacion(Integer idHabitacion);

}
