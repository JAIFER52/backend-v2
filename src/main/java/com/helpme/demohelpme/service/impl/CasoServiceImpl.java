package com.helpme.demohelpme.service.impl;

import com.helpme.demohelpme.dto.CasoDTO;
import com.helpme.demohelpme.model.Caso;
import com.helpme.demohelpme.repository.ICasoRepository;
import com.helpme.demohelpme.service.iface.ICasoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CasoServiceImpl implements ICasoService {

    private final ICasoRepository casoRepository;
    private Arrays caso;

    public CasoServiceImpl(ICasoRepository casoRepository) {
        this.casoRepository = casoRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<CasoDTO> findAll() {
        List <Caso> casos = casoRepository.findAll();
        List <CasoDTO> casoDTOS = casos.stream()
                .map(d -> {
                    CasoDTO casoDTO=
                            CasoDTO.builder()
                                    .id(d.getId())
                                    .altitud(d.getAltitud())
                                    .latitud(d.getLatitud())
                                    .longitud(d.getLongitud())
                                    .descripcion(d.getDescripcion())
                                    .build();

                    return casoDTO;
                } ).collect(Collectors.toList());

        return casoDTOS;


    }


    @Override
    public List<CasoDTO> findAll(Long id) {
        return null;
    }

    @Override
    public CasoDTO save(CasoDTO casoDTO) {
        return null;
    }

    @Override
    public Boolean visible(Boolean visible, long id) {
        return null;
    }

    @Override
    public CasoDTO findById(long id) {
        return null;
    }

    @Override
    public Caso create(Caso caso) {
        return casoRepository.save(caso);
    }
}
