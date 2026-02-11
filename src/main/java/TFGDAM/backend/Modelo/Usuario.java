package TFGDAM.backend.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder

@Entity
@Table(name = "USUARIOS")
public class Usuario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String dni;

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private LocalDate fechaAlta;
}
