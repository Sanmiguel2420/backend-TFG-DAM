package TFGDAM.backend.Servicio;

import TFGDAM.backend.Modelo.Libro;

import java.util.List;

public interface ILibroServicio {

    public List<Libro> findAll();
    public List<Libro> findByNombre(String nombre);
    public List<Libro> findByAutor(String autor);
    public List<Libro> findByEditor(String editor);
    public List<Libro> findByCreador(String creador);


}
