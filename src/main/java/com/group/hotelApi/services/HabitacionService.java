package com.group.hotelApi.services;

import com.group.hotelApi.entities.Habitacion;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Repository;
>>>>>>> erik
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HabitacionService {
<<<<<<< HEAD
    List<Habitacion> listarHabitaciones();
=======

     List<Habitacion> listarHabitaciones();
     Habitacion buscarHabitacion(Integer idHabitacion);
     Habitacion crearHabitacion(Habitacion habitacion);
     Habitacion editarHabitacion(Integer idHabitacion,Habitacion habitacion);
     void eliminarHabitacion(Integer idHabitacion);

>>>>>>> erik
}
