package com.helpme.demohelpme.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity     //convierte una entidad de hibernate
@Table  (name = "roles")
@Data       // @Getter    @Setter
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "nombre", length = 45, nullable = false)
    private  String nombre;

    private String descripcion;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

     // bidireccional
    @ManyToMany(mappedBy = "roles")
    List<Usuario> usuarios;
}
