package com.helpme.demohelpme.service.iface;

import com.helpme.demohelpme.dto.CasoDTO;
import com.helpme.demohelpme.model.Caso;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ICasoService {

    // consultar todos los casos existentes

    @Transactional(readOnly = true)
    abstract List<CasoDTO> findAll();


    // CREAR UN CASO

    List<CasoDTO> findAll(Long id);

    public CasoDTO save(CasoDTO casoDTO);

    // acativiar / inactivar caso

    public Boolean visible(Boolean visible, long id);

    // consultar caso por ID

    public CasoDTO findById(long id);

    Caso create(Caso caso);
}
