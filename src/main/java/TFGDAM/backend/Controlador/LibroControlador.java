package TFGDAM.backend.Controlador;

import TFGDAM.backend.Modelo.Categoria;
import TFGDAM.backend.Modelo.Libro;
import TFGDAM.backend.Modelo.TipoLibro;
import TFGDAM.backend.Servicio.ILibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
