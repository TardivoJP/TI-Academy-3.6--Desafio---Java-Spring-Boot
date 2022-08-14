package br.com.tiacademy.biblioteca.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.biblioteca.core.crud.BibliotecaService;
import br.com.tiacademy.biblioteca.domain.Editora;

@Service
public class EditoraService extends BibliotecaService<Editora, Long> {

    @Override
    protected Editora editarEntidade(Editora recuperado, Editora entity){
        recuperado.setNome(entity.getNome());
        return recuperado;
    }
}
