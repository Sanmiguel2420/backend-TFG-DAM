package TFGDAM.backend.Controlador;

import TFGDAM.backend.Modelo.Libro;
import TFGDAM.backend.Servicio.ILibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("TfgDam/Libro")
public class LibroControlador {
    @Autowired
    private ILibroServicio libroServicio;

    @GetMapping("/cargarDatos")
    public ResponseEntity<String> cargarDatos(){
        Libro l = Libro.builder().ISBN("12345").titulo("Palabras Radiantes").autor("Brandon Sanderson").editorial("Nova").categorias(FANTASIA).fechaSalida().tipoLibro().build()
    }
}
