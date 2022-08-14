package br.com.tiacademy.times.repository;

import br.com.tiacademy.times.core.crud.TimesRepository;
import br.com.tiacademy.times.domain.Clube;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubeRepository extends TimesRepository<Clube, Long> {
    
}
