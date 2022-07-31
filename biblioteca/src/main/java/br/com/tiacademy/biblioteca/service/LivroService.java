package br.com.tiacademy.biblioteca.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.biblioteca.core.crud.BibliotecaService;
import br.com.tiacademy.biblioteca.domain.Livro;

@Service
public class LivroService extends BibliotecaService<Livro, Long> {

    @Override
    protected Livro editarEntidade(Livro recuperado, Livro entity){
        recuperado.setNome(entity.getNome());
        return recuperado;
    }
}
