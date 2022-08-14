package br.com.tiacademy.biblioteca.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.tiacademy.biblioteca.core.crud.BibliotecaDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Editora implements BibliotecaDomain<Long>, Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer anoFundacao;

    // Aqui poderíamos iniciar a criar as relações da tabela das editoras
    // com as tabelas dos autores e dos livros
    
}
