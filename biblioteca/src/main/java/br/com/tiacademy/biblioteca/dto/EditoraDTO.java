package br.com.tiacademy.biblioteca.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EditoraDTO implements Serializable {
    
    private Long id;
    private String nome;
    private Integer anoFundacao;

}
