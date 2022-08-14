package br.com.tiacademy.times.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClubeDTO implements Serializable {
    
    private Long id;
    private String nome;
    private String serie;
    private Integer rankingIffhs;
    private Integer anoFundacao;
    
}
