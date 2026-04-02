package TFGDAM.backend.Controlador;

import TFGDAM.backend.Modelo.Categoria;
import TFGDAM.backend.Modelo.Libro;
import TFGDAM.backend.Modelo.TipoLibro;
import TFGDAM.backend.Servicio.ILibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("TfgDam/Libro")
public class LibroControlador {
    @Autowired
    private ILibroServicio libroServicio;

    @GetMapping("/cargar")
    public ResponseEntity<String> cargarDatos(){
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(Categoria.FANTASIA);
        Libro l = Libro.builder().ISBN("12345").titulo("Palabras Radiantes").autor("Brandon Sanderson").editorial("Nova").categorias(categorias).fechaSalida(LocalDate.now()).tipoLibro(TipoLibro.TAPA_DURA).build();

        libroServicio.insert(l);
        return ResponseEntity.ok("Datos cargados correctamente");
    }

    @GetMapping("/consultar")
    public ResponseEntity<List<Libro>> consultarDatos(){
        return ResponseEntity.ok(libroServicio.findAll());
    }

    @GetMapping("/consultarPorISBN")
    public ResponseEntity<Libro> consultarPorISBN(@RequestParam String ISBN){
        return ResponseEntity.ok(libroServicio.findByISBN(ISBN));
    }

    @GetMapping("/consultarPorTitulo")
    public ResponseEntity<List<Libro>> consultarPorTitulo(@RequestParam String titulo){
        return ResponseEntity.ok(libroServicio.findByTitulo(titulo));
    }

    @GetMapping("/consultarPorAutor")
    public ResponseEntity<List<Libro>> consultarPorAutor(@RequestParam String autor){
        return ResponseEntity.ok(libroServicio.findByAutor(autor));
    }

    @GetMapping("/consultarPorEditorial")
    public ResponseEntity<List<Libro>> consultarPorEditorial(@RequestParam String editorial){
        return ResponseEntity.ok(libroServicio.findByEditorial(editorial));
    }

  /*  @PostMapping("/insertar")
    public ResponseEntity<String> insertarLibro(@RequestBody Libro libro){
        libroServicio.insert(libro);
        return ResponseEntity.ok("Libro insertado correctamente");
    }*/

    @DeleteMapping("/eliminar")
    public ResponseEntity<String> eliminarLibro(@RequestParam String ISBN){
        libroServicio.delete(ISBN);
        return ResponseEntity.ok("Libro eliminado correctamente");
    }

}
