package com.helpme.demohelpme.controller;


import com.helpme.demohelpme.dto.DelitoDTO;
import com.helpme.demohelpme.model.Delito;
import com.helpme.demohelpme.service.iface.IDelitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/delitos")
public class DelitoController {

    @Autowired
    private IDelitoService  delitoService;


   @GetMapping

   public ResponseEntity<List<DelitoDTO>> index (){
       return ResponseEntity
               .status(HttpStatus.OK)
               .body(delitoService.findAll());
   }

    @PostMapping()
    public ResponseEntity<Delito> createDelito(@RequestBody Delito delito){
    Delito createDelito = delitoService.create(delito);
    return ResponseEntity.status(HttpStatus.CREATED).body(createDelito);
    }


}
