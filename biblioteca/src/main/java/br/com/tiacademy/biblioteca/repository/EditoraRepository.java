package br.com.tiacademy.biblioteca.repository;

import br.com.tiacademy.biblioteca.core.crud.BibliotecaRepository;
import br.com.tiacademy.biblioteca.domain.Editora;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoraRepository extends BibliotecaRepository<Editora, Long> {
    
}
