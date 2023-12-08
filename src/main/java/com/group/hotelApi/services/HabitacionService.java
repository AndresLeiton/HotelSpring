package com.group.hotelApi.services;

import com.group.hotelApi.entities.Habitacion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HabitacionService {
    List<Habitacion> listarHabitaciones();
}
