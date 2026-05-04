package TFGDAM.backend.Controlador;

import TFGDAM.backend.Modelo.*;
import TFGDAM.backend.Servicio.IPrestamoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Tfgdam/Prestamo")
public class PrestamoControlador {
    @Autowired
    private IPrestamoServicio prestamoServicio;

   /* @GetMapping("/cargar")
    public ResponseEntity<String> cargarPrestamo(){
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(Categoria.FANTASIA);
        Libro libro = Libro.builder().ISBN("12345").titulo("Palabras Radiantes").autor("Brandon Sanderson").editorial("Nova").categorias(categorias).fechaSalida(LocalDate.now()).tipoLibro(TipoLibro.TAPA_DURA).build();
        Prestamo p = Prestamo.builder().numOperacion("00001").libro(libro).usuario().fechaPrestamo(LocalDate.now()).build();
    }*/

    @GetMapping("/consultar")
    public ResponseEntity<List<Prestamo>> consultar(){
        return ResponseEntity.ok(prestamoServicio.findAll());
    }

   /* @GetMapping("/consultar/usuario")
    public ResponseEntity<List<Prestamo>> consultarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok(prestamoServicio.findByUsuario(usuario));
    }

    @GetMapping("/consultar/libro")
    public ResponseEntity<List<Prestamo>> consultarLibro(@RequestBody Libro libro){
        return ResponseEntity.ok(prestamoServicio.findByLibro(libro));
    }
*/
    @GetMapping("/consultar/id")
    public ResponseEntity<Prestamo> consultarId(@RequestParam String id){
        return ResponseEntity.ok(prestamoServicio.findById(id));
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> insertarPrestamo(@RequestBody Prestamo prestamo){
        try {
            prestamoServicio.save(prestamo);
            return ResponseEntity.ok("Prestamo guardado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

  /*  @PutMapping("/actualizar")
    public ResponseEntity<String> actualizarPrestamo(@RequestBody Prestamo prestamo){
        try {
            prestamoServicio.save(prestamo);
            return ResponseEntity.ok("Prestamo actualizado exitosamente");
        }  catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
*/
    @DeleteMapping("/eliminar")
    public ResponseEntity<String> eliminarPrestamo(@RequestParam String id){
        try {
            prestamoServicio.delete(id);
            return ResponseEntity.ok("Prestamo eliminado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
