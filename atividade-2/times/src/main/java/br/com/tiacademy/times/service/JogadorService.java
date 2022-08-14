package br.com.tiacademy.times.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.times.core.crud.TimesService;
import br.com.tiacademy.times.domain.Jogador;

@Service
public class JogadorService extends TimesService<Jogador, Long> {

    @Override
    protected Jogador editarEntidade(Jogador recuperado, Jogador entity) {
        recuperado.setNome(entity.getNome());
        return recuperado;
    }

    
}
