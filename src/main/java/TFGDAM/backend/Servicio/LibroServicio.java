package TFGDAM.backend.Servicio;

import TFGDAM.backend.Modelo.Libro;
import TFGDAM.backend.Repositorio.LibroDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServicio implements ILibroServicio {
    @Autowired private LibroDAO libroDAO;

    @Override
    public Libro findByISBN(String isbn) {
        Libro libro = libroDAO.findById(isbn).get();
        if (libro == null) {
            throw new RuntimeException("Libro no encontrado");
        }
        return libro;
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
    public List<Libro> findByEditorial(String editorial) {
        return libroDAO.findByEditorial(editorial);
    }

    @Override
    public boolean insert(Libro libro) {
        boolean respuesta = false;
        List<Libro> libros = (List<Libro>) libroDAO.findAll();
        if(!libros.contains(libro)) {
            libroDAO.save(libro);
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
        return respuesta;
    }

    @Override
    public boolean delete(String isbn) {
        boolean respuesta = false;
        Optional<Libro> libroGuardado = libroDAO.findById(isbn);
        if(libroGuardado.isPresent()) {
            libroDAO.delete(libroGuardado.get());
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public List<Libro> findAll() {
        return libroDAO.findAll();
    }

}
