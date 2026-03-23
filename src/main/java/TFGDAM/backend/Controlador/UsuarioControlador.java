package TFGDAM.backend.Controlador;

import TFGDAM.backend.Modelo.Usuario;
import TFGDAM.backend.Servicio.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("Tfgdam/Usuario")
public class UsuarioControlador {
    @Autowired
    private IUsuarioServicio usuarioServicio;

    @GetMapping("/cargar")
    public ResponseEntity<String> cargarUsuario(){
        Usuario u = Usuario.builder().dni("000001M").nombre("Juan").apellidos("Garcia Martin").fechaNacimiento(LocalDate.now().minusYears(18)).fechaAlta(LocalDate.now().minusMonths(4)).build();
        usuarioServicio.insert(u);
        return ResponseEntity.ok("Usuario cargado correctamente");
    }

    @GetMapping("/consultar")
    public ResponseEntity<List<Usuario>> consultarUsuarios(){
        return ResponseEntity.ok(usuarioServicio.findAll());
    }

    @GetMapping("/consultar/porDni")
    public ResponseEntity<Usuario> consultarUsuariosPorDni(@RequestParam String dni){
        return ResponseEntity.ok(usuarioServicio.findById(dni));
    }

    @PostMapping("/insertar")
    public ResponseEntity<String> insertar(@RequestBody Usuario usuario){
        usuarioServicio.insert(usuario);
        return ResponseEntity.ok("Insertado Correctamente");
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<String> eliminar(@RequestParam String dni){
        usuarioServicio.delete(usuarioServicio.findById(dni));
        return ResponseEntity.ok("Eliminado Correctamente");
    }

    @PutMapping("/actualizar")
    public ResponseEntity<String> actualizar(@RequestBody Usuario usuario){
        usuarioServicio.update(usuario);
        return ResponseEntity.ok("Actualizado Correctamente");
    }
}
