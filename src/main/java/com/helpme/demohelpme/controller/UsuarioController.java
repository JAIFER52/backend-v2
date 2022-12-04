package com.helpme.demohelpme.controller;


import com.helpme.demohelpme.model.Usuario;
import com.helpme.demohelpme.service.iface.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping()
    public ResponseEntity<String>testGet(){
        return ResponseEntity.status(HttpStatus.OK).body("OK ejec GET");
    }



   @PostMapping ()
   public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario){
     Usuario createUsuario =usuarioService.create(usuario);
     return ResponseEntity.status(HttpStatus.CREATED).body(createUsuario);
   }


    //informacion BD postman 1
 //  @PostMapping ()
 //  public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario){
  //   Usuario createUsuario = usuarioService.create(usuario);
   //  return ResponseEntity.status(HttpStatus.OK)
  //             .body(createUsuario);
 //   }

    //crear lista usuarios
  // @GetMapping()
  //  public ResponseEntity<List<Usuario>>listUsuarios(){
    //   List<Usuario> List = service.listUsuarios();
   //    return ResponseEntity.status(HttpStatus.OK).body(List);
   //}




}
