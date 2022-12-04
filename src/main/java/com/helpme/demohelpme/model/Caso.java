package com.helpme.demohelpme.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Persistent;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "casos")
@Getter
@Setter

public class Caso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "fecha_hora", nullable = false)
    private LocalDateTime fechaHora;

    @Column
    private Float latitud;

    @Column
    private Float longitud;

    @Column
    private Float altitud;

    @Column
    private Boolean visible;

    @Column
    private String descripcion;

    @Column(name = "url_map")
    private String urlMap;

    @Column(name = "rmi_url")
    private String rmiUrl;


    @ManyToOne
    @JoinColumn(name = "delitos_id")
    private Delito delito;

    @ManyToOne
    @JoinColumn(name = "usuarios_id")
    private Usuario usuario;


    //  fecha por defecto del registro si no se ingresa por el usuario

    @PrePersist
    public void prePersist (){
        if (Objects.isNull(fechaHora)){
            fechaHora = LocalDateTime.now();
        }
    }

}
