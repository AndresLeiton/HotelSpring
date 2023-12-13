package com.group.hotelApi.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private Integer telefono;
    private LocalDate fecNaci;
    @OneToMany(mappedBy ="cliente")
    private Set<Habitacion> habitaciones = new HashSet<>();

    public void setHabitaciones(Set<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
        for (Habitacion habitacion : habitaciones){
            habitacion.setCliente(this);
        }
    }
}
