package TFGDAM.backend.Repositorio;

import TFGDAM.backend.Modelo.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroDAO extends CrudRepository<Libro, String> {

    List<Libro> findByTitulo(String titulo);
    List<Libro> findByAutor(String autor);
    List<Libro> findByEditor(String editor);

}
