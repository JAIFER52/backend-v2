package com.helpme.demohelpme.service.impl;

import com.helpme.demohelpme.dto.UsuarioDTO;
import com.helpme.demohelpme.model.Usuario;
import com.helpme.demohelpme.repository.IUsuarioRepository;
import com.helpme.demohelpme.service.iface.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;



@Service
public class UsuarioServiceImpl implements IUsuarioService {


    private final IUsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(IUsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }


    @Transactional(readOnly = true)
    @Override
    public List<UsuarioDTO> findAll() {
        List <Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();
        List <UsuarioDTO> usuarioDTOS =  usuarios.stream()
                .map(d -> {
                    UsuarioDTO usuarioDTO=
                            UsuarioDTO.builder()
                                    .id(d.getId())
                                    .nombre(d.getNombre())
                                    .build();

                    return usuarioDTO;
                } ).collect(Collectors.toList());

        return usuarioDTOS;


    }

    @Override
    public UsuarioDTO findbyId(Long id) {
        return null;
    }

    @Override
    public UsuarioDTO save(UsuarioDTO usuarioDTO) {
        return null;
    }

    @Override
    public Usuario findByUsername(String name) {
        return null;
    }

    @Override
    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario)
                ;
    }

    @Override
    public List<Usuario> listUsuarios() {
        return null;
    }

}
