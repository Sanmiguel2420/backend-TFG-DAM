package TFGDAM.backend.Servicio;


import TFGDAM.backend.Modelo.Usuario;

public interface IUsuarioServicio {

    public boolean insert(Usuario usuario);
    public boolean update(Usuario usuario);
    public boolean delete(Usuario usuario);

}
