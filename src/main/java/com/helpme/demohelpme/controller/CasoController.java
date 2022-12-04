package com.helpme.demohelpme.controller;


import com.helpme.demohelpme.dto.CasoDTO;
import com.helpme.demohelpme.model.Caso;
import com.helpme.demohelpme.service.iface.ICasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/casos")
public class CasoController {



    @Autowired
    private ICasoService casoService;


    @GetMapping

    public ResponseEntity<List<CasoDTO>> index (){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(casoService.findAll());
    }

    @PostMapping()
    public ResponseEntity<Caso> createCaso(@RequestBody Caso caso){
        Caso createCaso = casoService.create(caso);
        return ResponseEntity.status(HttpStatus.CREATED).body(createCaso);
    }
}
