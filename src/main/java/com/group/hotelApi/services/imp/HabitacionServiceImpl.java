package com.group.hotelApi.services.imp;

import com.group.hotelApi.entities.Habitacion;
import com.group.hotelApi.repository.HabitacionRepository;
import com.group.hotelApi.services.HabitacionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class HabitacionServiceImpl implements HabitacionService {
    private HabitacionRepository habitacionRepository;

    @Override
    public List<Habitacion> listarHabitaciones() {
        return habitacionRepository.findAll();
    }
}
