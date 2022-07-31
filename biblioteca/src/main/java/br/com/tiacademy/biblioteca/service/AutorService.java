package br.com.tiacademy.biblioteca.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.biblioteca.core.crud.BibliotecaService;
import br.com.tiacademy.biblioteca.domain.Autor;

@Service
public class AutorService extends BibliotecaService<Autor, Long> {

    @Override
    protected Autor editarEntidade(Autor recuperado, Autor entity) {
        recuperado.setNome(entity.getNome());
        return recuperado;
    }

    
}
