package TFGDAM.backend.Servicio;

import TFGDAM.backend.Modelo.Libro;
import TFGDAM.backend.Modelo.Prestamo;
import TFGDAM.backend.Modelo.Usuario;
import TFGDAM.backend.Repositorio.PrestamoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public void save(Prestamo prestamo) {
        boolean respuesta = false;
        List<Prestamo> prestamos = (List<Prestamo>) prestamoDAO.findAll();
        if (!prestamos.contains(prestamo)) {
            prestamoDAO.save(prestamo);
            respuesta = true;
        }
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

    public void delete(String id) {
        Optional<Prestamo> prestamoGuardado = prestamoDAO.findById(id);
        prestamoGuardado.ifPresent(prestamo -> prestamoDAO.delete(prestamo));
    }
}
