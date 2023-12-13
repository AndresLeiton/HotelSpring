package com.group.hotelApi.services.imp;

import com.group.hotelApi.entities.Cliente;
import com.group.hotelApi.entities.Habitacion;
import com.group.hotelApi.repository.ClienteRepository;
import com.group.hotelApi.repository.HabitacionRepository;
import com.group.hotelApi.services.HabitacionService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class HabitacionServiceImpl implements HabitacionService {

    private HabitacionRepository habitacionRepository;
    private ClienteRepository clienteRepository;
    @Override
    public List<Habitacion> listarHabitaciones() {
        return habitacionRepository.findAll();
    }

    @Override
    public Habitacion buscarHabitacion(Integer idHabitacion) {
        return habitacionRepository.findById(idHabitacion)
                .orElseThrow(()->new RuntimeException("habitacion no encontrado con el id :"+idHabitacion));
    }

    @Override
    public Habitacion crearHabitacion(Habitacion habitacion) {
        Optional<Cliente> clienteOptional= clienteRepository.findById(habitacion.getCliente().getIdCliente());
        if (clienteOptional.isPresent()){
            habitacion.setCliente(clienteOptional.get());

            return habitacionRepository.save(habitacion);
        }
        else return null;
    }

    @Override
    public Habitacion editarHabitacion(Integer idHabitacion, Habitacion habitacion) {
        return null;
    }

    @Override
    public void eliminarHabitacion(Integer idHabitacion) {

    }
}
