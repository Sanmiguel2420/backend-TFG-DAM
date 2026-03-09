package TFGDAM.backend.Servicio;


import TFGDAM.backend.Modelo.Libro;
import TFGDAM.backend.Modelo.Prestamo;
import TFGDAM.backend.Modelo.Usuario;

import java.util.List;

public interface IPrestamoServicio {

    List<Prestamo> findAll();
    List<Prestamo> findByUsuario(Usuario usuario);
    List<Prestamo> findByLibro(Libro libro);
    Prestamo findById(String id);
    boolean save(Prestamo prestamo);
    boolean update(Prestamo prestamo);
}
