package com.group.hotelApi.entities.dto;

import com.group.hotelApi.entities.Habitacion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDto {

        private Integer idCliente;
        private String nombre;
        private String apellido;
        private String email;
        private Integer telefono;
        private LocalDate fecNaci;
        private List<Habitacion> habitaciones;


}
