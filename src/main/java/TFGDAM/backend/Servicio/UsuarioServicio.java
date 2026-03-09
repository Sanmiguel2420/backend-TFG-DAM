package TFGDAM.backend.Servicio;

import TFGDAM.backend.Modelo.Prestamo;
import TFGDAM.backend.Modelo.Usuario;
import TFGDAM.backend.Repositorio.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio implements IUsuarioServicio {
    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public boolean insert(Usuario usuario) {
        boolean respuesta = false;
        List<Usuario> usuarios = (List<Usuario>) usuarioDAO.findAll();
        if(!usuarios.contains(usuario)) {
            usuarioDAO.save(usuario);
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public boolean update(Usuario usuario) {
       boolean respuesta = false;
       Optional<Usuario> usuarios = usuarioDAO.findById(usuario.getDni());
        if(usuarios.isPresent()) {
            usuarioDAO.save(usuario);
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public boolean delete(Usuario usuario) {
       boolean respuesta = false;
       Optional<Usuario> usuarios = usuarioDAO.findById(usuario.getDni());
       if(usuarios.isPresent()) {
            usuarioDAO.delete(usuario);
            respuesta = true;
       }
        return respuesta;
    }
}
