package br.com.tiacademy.biblioteca.repository;

import org.springframework.stereotype.Repository;
import br.com.tiacademy.biblioteca.core.crud.BibliotecaRepository;
import br.com.tiacademy.biblioteca.domain.Livro;

@Repository
public interface LivroRepository extends BibliotecaRepository<Livro, Long>{
    
}
