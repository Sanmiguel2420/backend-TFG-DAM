package TFGDAM.backend.Repositorio;

import TFGDAM.backend.Modelo.Libro;
import TFGDAM.backend.Modelo.Prestamo;
import TFGDAM.backend.Modelo.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrestamoDAO extends CrudRepository<Prestamo, String> {

    @Query("SELECT p FROM Prestamo p WHERE p.usuario = ?1")
    List<Prestamo> findByUsuario(Usuario usuario);

    @Query("SELECT p FROM Prestamo p WHERE p.libro = ?1")
    List<Prestamo> findByLibro(Libro libro);
}
