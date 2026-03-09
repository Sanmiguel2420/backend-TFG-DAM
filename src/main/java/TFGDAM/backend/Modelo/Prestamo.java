package TFGDAM.backend.Modelo;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder

@Entity
@Table(name = "PRESTAMOS")
public class Prestamo implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String numOperacion;

    @ManyToOne(fetch = FetchType.EAGER)
    Libro libro;

    @ManyToOne(fetch = FetchType.EAGER)
    Usuario usuario;
    @Column(name = "FechaPrestamo")
    private Date fechaPrestamo;
}
