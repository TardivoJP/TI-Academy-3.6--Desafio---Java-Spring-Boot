package br.com.tiacademy.biblioteca.repository;

import org.springframework.stereotype.Repository;
import br.com.tiacademy.biblioteca.core.crud.BibliotecaRepository;
import br.com.tiacademy.biblioteca.domain.Autor;

@Repository
public interface AutorRepository extends BibliotecaRepository<Autor, Long>{
    
}
