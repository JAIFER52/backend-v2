package com.helpme.demohelpme.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;    // no es buena practica
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "username",
            unique = true,
            length = 120)
    private String username;

    @Column(name = "nombre",
            nullable = false, length = 120)
    private String nombre;


    @Column(name = "apellido",
            length = 120)
    private String apellido;

    @Column   //
    private String password;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column
    private Boolean enable;

    @Column(name = "red_social")
    private Boolean redSocial;

    @Column
    private String image;

    // relacion de muchos a muchos entre usuarios y roles
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "roles_usuarios",
                joinColumns = {@JoinColumn(name = "usuario_id")},
                inverseJoinColumns = {@JoinColumn(name = "roles_id")})
    List<Role> roles;




}
