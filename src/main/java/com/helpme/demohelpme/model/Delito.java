package com.helpme.demohelpme.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "delitos")
@Getter
@Setter
public class Delito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "nombre",
            nullable = false)
    private String nombre;

    @Column
    private  String descripcion;


    // llevar registro de que usuario creo el delito
    @ManyToOne
    @JoinColumn(name =  "usuarios_id")
    private Usuario usuario;


}
