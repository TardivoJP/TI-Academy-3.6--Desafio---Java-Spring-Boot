package br.com.tiacademy.times.repository;

import org.springframework.stereotype.Repository;
import br.com.tiacademy.times.core.crud.TimesRepository;
import br.com.tiacademy.times.domain.Jogador;

@Repository
public interface JogadorRepository extends TimesRepository<Jogador, Long>{
    
}
