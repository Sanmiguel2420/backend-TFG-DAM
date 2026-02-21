package TFGDAM.backend.Servicio;

import TFGDAM.backend.Modelo.Libro;
import TFGDAM.backend.Repositorio.LibroDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio implements ILibroServicio {
    @Autowired private LibroDAO libroDAO;
    @Override
    public List<Libro> findAll() {
        return (List<Libro>)(libroDAO.findAll());
    }

    @Override
    public List<Libro> findByNombre(String nombre) {
        return libroDAO.findByNombre(nombre);
    }

    @Override
    public List<Libro> findByAutor(String autor) {
        return libroDAO.findByAutor(autor);
    }

    @Override
    public List<Libro> findByEditor(String editor) {
        return libroDAO.findByEditor(editor);
    }

    @Override
    public List<Libro> findByCreador(String creador) {
        return libroDAO.findByCreador(creador);
    }
}
