package TFGDAM.backend.Controlador;

import TFGDAM.backend.Modelo.Categoria;
import TFGDAM.backend.Modelo.Libro;
import TFGDAM.backend.Modelo.Prestamo;
import TFGDAM.backend.Modelo.TipoLibro;
import TFGDAM.backend.Servicio.IPrestamoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("Tfgdam/Prestamo")
public class PrestamoControlador {
    @Autowired
    private IPrestamoServicio PrestamoServicio;

   /* @GetMapping("/cargar")
    public ResponseEntity<String> cargarPrestamo(){
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(Categoria.FANTASIA);
        Libro libro = Libro.builder().ISBN("12345").titulo("Palabras Radiantes").autor("Brandon Sanderson").editorial("Nova").categorias(categorias).fechaSalida(LocalDate.now()).tipoLibro(TipoLibro.TAPA_DURA).build();
        Prestamo p = Prestamo.builder().numOperacion("00001").libro(libro).usuario().fechaPrestamo(LocalDate.now()).build();
    }*/

}
