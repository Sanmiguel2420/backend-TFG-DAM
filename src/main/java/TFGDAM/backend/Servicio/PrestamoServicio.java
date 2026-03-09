package TFGDAM.backend.Servicio;

import TFGDAM.backend.Modelo.Libro;
import TFGDAM.backend.Modelo.Prestamo;
import TFGDAM.backend.Modelo.Usuario;
import TFGDAM.backend.Repositorio.PrestamoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrestamoServicio implements IPrestamoServicio {

    @Autowired
    PrestamoDAO prestamoDAO;

    @Override
    public List<Prestamo> findAll() {
        return (List<Prestamo>) prestamoDAO.findAll();
    }

    @Override
    public List<Prestamo> findByUsuario(Usuario usuario) {
        return prestamoDAO.findByUsuario(usuario);
    }

    @Override
    public List<Prestamo> findByLibro(Libro libro) {
        return prestamoDAO.findByLibro(libro);
    }

    @Override
    public Prestamo findById(String id) {
        Prestamo prestamo = prestamoDAO.findById(id).get();
        if (prestamo == null) {
            throw new RuntimeException("Prestamo no encontrado");
        }
        return prestamo;
    }

    @Override
    public boolean save(Prestamo prestamo) {
        boolean respuesta = false;
        List<Prestamo> prestamos = (List<Prestamo>) prestamoDAO.findAll();
        if (!prestamos.contains(prestamo)) {
            prestamoDAO.save(prestamo);
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public boolean update(Prestamo prestamo) {
        boolean respuesta = false;
        List<Prestamo> prestamos = (List<Prestamo>) prestamoDAO.findAll();
        if (!prestamos.contains(prestamo)) {
            prestamoDAO.save(prestamo);
            respuesta = true;
        }
        return respuesta;
    }
}
