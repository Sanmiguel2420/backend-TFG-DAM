package TFGDAM.backend.Repositorio;

import TFGDAM.backend.Modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioDAO extends CrudRepository<Usuario,String> {

   List<Usuario> findByNombre(String nombre);
   List<Usuario> findByApellido(String apellido);
   boolean mayorDeEdad(Usuario usuario);
}
