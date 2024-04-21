package br.acsousa.javagpt1.dtos;

import br.acsousa.javagpt1.entities.Materia;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AssuntoDTO {
    private Long id;
    private String nome;
    private Materia materia;
}
