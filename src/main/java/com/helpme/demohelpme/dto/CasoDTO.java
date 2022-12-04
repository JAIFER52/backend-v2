package com.helpme.demohelpme.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@Builder
@FieldDefaults(level = PRIVATE)
public class CasoDTO {

    Long id;
    float altitud;
    String descripcion;
    LocalDateTime fecha_hora;
    float latitud;
    float  longitud;
    Boolean visible;



}
