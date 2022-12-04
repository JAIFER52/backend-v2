package com.helpme.demohelpme.service.impl;

import com.helpme.demohelpme.dto.DelitoDTO;
import com.helpme.demohelpme.model.Delito;
import com.helpme.demohelpme.repository.IDelitoRepository;
import com.helpme.demohelpme.service.iface.IDelitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DelitoServiceImpl implements IDelitoService {


    private final IDelitoRepository delitoRepository;

    @Autowired
    public DelitoServiceImpl(IDelitoRepository delitoRepository){
        this.delitoRepository = delitoRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<DelitoDTO> findAll() {
        List <Delito> delitos = delitoRepository.findAll();
        List <DelitoDTO> delitoDTOS =  delitos.stream()
                .map(d -> {
                    DelitoDTO delitoDTO=
                            DelitoDTO.builder()
                                    .id(d.getId())
                                    .nombre(d.getNombre())
                                    .descripcion(d.getDescripcion())
                                    .build();

                    return delitoDTO;
                } ).collect(Collectors.toList());

        return delitoDTOS;


    }

    @Override
    public DelitoDTO findById(Long id) {
        return null;
    }

    @Override
    public DelitoDTO save(DelitoDTO delitoDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Delito create(Delito delito) {
        return delitoRepository.save(delito)
                ;
    }

    @Override
    public List<Delito> listdelitos() {
        return null;
    }
}
