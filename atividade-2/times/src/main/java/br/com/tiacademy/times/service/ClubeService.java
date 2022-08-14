package br.com.tiacademy.times.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.times.core.crud.TimesService;
import br.com.tiacademy.times.domain.Clube;

@Service
public class ClubeService extends TimesService<Clube, Long> {

    @Override
    protected Clube editarEntidade(Clube recuperado, Clube entity){
        recuperado.setNome(entity.getNome());
        return recuperado;
    }
}
