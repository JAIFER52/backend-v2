package com.helpme.demohelpme.dto;

import jdk.jshell.Snippet;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;


@Getter
@Setter
@FieldDefaults(level = PRIVATE)
@Builder
public class UsuarioDTO {

    Long id;
    String username;
    String nombre;
    String apellido;
    String password;
    LocalDate fechaNacimiento;
    Boolean enable;
    Boolean redSocial;
    String image;





}
