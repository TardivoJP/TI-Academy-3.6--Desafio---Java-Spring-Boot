package br.com.tiacademy.times.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.tiacademy.times.core.crud.TimesDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Clube implements TimesDomain<Long>, Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String serie;
    private Integer rankingIffhs;
    private Integer anoFundacao;

    // Aqui poderíamos iniciar a criar as relações da tabela dos clubes
    // com a tabela dos jogadores
    
}
