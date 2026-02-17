package TFGDAM.backend.Modelo;

import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder

public class Libro implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String ISBN;
    private String titulo;
    private String autor;
    private String editorial;
    private List<Categoria> categorias;
    private LocalDate fechaSalida;
    private TipoLibro tipoLibro;

}
