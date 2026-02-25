package TFGDAM.backend.Servicio;

import TFGDAM.backend.Modelo.Libro;
import TFGDAM.backend.Repositorio.LibroDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LibroServicio implements ILibroServicio {
    @Autowired private LibroDAO libroDAO;

    @Override
    public Libro findByISBN(String isbn) {
        return libroDAO.findById(isbn);
    }

    @Override
    public List<Libro> findByTitulo(String titulo) {
        return libroDAO.findByTitulo(titulo);
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
    public boolean insert(Libro libro) {
        boolean respuesta = false;
        List<Libro> libros = (ArrayList<Libro>) libroDAO.findAll();
        if(!libros.contains(libro)) {
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public boolean update(Libro libro) {
        boolean respuesta = false;
        Optional<Libro> libroGuardado = libroDAO.findById(libro.getISBN());
        if(libroGuardado.isPresent()) {
            libroDAO.save(libro);
            respuesta = true;
        }
        return repuesta;
    }

    @Override
    public boolean delete(Libro libro) {
        boolean respuesta = false;
        Optional<Libro> libroGuardado = libroDAO.findById(libro.getISBN());
        if(libroGuardado.isPresent()) {
            libroDAO.delete(libro);
            respuesta = true;
        }
        return respuesta;
    }

}
