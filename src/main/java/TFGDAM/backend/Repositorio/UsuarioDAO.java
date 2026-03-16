package TFGDAM.backend.Repositorio;

import TFGDAM.backend.Modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioDAO extends CrudRepository<Usuario,String> {

   List<Usuario> findByNombre(String nombre);
   List<Usuario> findByApellidos(String apellido);
}
