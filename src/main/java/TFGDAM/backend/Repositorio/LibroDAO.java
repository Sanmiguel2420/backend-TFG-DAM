package TFGDAM.backend.Repositorio;

import TFGDAM.backend.Modelo.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroDAO extends CrudRepository<Libro, String> {

    List<Libro> findByNombre(String nombre);
    List<Libro> findByAutor(String autor);
    List<Libro> findByEditor(String editor);
    List<Libro> findByCreador(String creador);
}
