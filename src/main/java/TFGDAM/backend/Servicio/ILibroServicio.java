package TFGDAM.backend.Servicio;

import TFGDAM.backend.Modelo.Libro;

import java.util.List;

public interface ILibroServicio {

    public Libro findByISBN(String isbn);
    public List<Libro> findByTitulo(String titulo);
    public List<Libro> findByAutor(String autor);
    public List<Libro> findByEditor(String editor);
    public boolean insert(Libro libro);
    public boolean update(Libro libro);
    public boolean delete(Libro libro);
    List<Libro> findAll();
}
