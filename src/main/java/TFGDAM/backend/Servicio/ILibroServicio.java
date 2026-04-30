package TFGDAM.backend.Servicio;

import TFGDAM.backend.Modelo.Libro;

import java.util.List;

public interface ILibroServicio {

    public Libro findByISBN(String isbn);
    public List<Libro> findByTitulo(String titulo);
    public List<Libro> findByAutor(String autor);
    public List<Libro> findByEditorial(String editor);
    public void insert(Libro libro);
    public boolean update(Libro libro);
    public void delete(String isbn);
    List<Libro> findAll();
}
