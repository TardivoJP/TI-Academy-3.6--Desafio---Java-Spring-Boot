package br.com.tiacademy.times.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JogadorDTO implements Serializable {
    
    private Long id;
    private String nome;
    private String posicao;
    private Integer idade;

}
