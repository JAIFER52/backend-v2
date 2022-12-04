package com.helpme.demohelpme.service.iface;

import com.helpme.demohelpme.dto.DelitoDTO;
import com.helpme.demohelpme.model.Delito;

import java.util.List;

public interface IDelitoService {

    // mostrar o listar todos los delitos

    public List<DelitoDTO> findAll();

    // Listar un delito por ID

    public DelitoDTO findById(Long id);


    // Guardar un delito

    public DelitoDTO save (DelitoDTO delitoDTO);

    // Borrar un delito

    public void delete(Long id);

    Delito create(Delito delito);

    List<Delito> listdelitos();
}
