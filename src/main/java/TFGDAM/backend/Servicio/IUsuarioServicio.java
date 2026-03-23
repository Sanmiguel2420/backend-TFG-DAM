package TFGDAM.backend.Servicio;


import TFGDAM.backend.Modelo.Usuario;

import java.util.List;

public interface IUsuarioServicio {

    public boolean insert(Usuario usuario);
    public boolean update(Usuario usuario);
    public boolean delete(Usuario usuario);
    List<Usuario> findAll();

    Usuario findById(String dni);
}
