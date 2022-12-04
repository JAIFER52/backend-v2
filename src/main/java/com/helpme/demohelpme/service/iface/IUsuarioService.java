package com.helpme.demohelpme.service.iface;

import com.helpme.demohelpme.dto.UsuarioDTO;
import com.helpme.demohelpme.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    // listar todos los usuarios

    public List<UsuarioDTO> findAll();

    //Listar usuario por ID

    public UsuarioDTO findbyId(Long id);

    // registrar usuario

    public UsuarioDTO save(UsuarioDTO usuarioDTO);

    // buscar por usuario

    public Usuario findByUsername(String name);

    Usuario create(Usuario usuario);

    List<Usuario> listUsuarios();
}
