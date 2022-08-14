package br.com.tiacademy.times.repository;

import br.com.tiacademy.times.core.crud.TimesRepository;
import br.com.tiacademy.times.domain.Clube;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubeRepository extends TimesRepository<Clube, Long> {
    
    @Query(value = "select c from Clube c where c.nome = :nome")
    Clube consultarPeloNome(@Param("nome") String nome);

    @Query(value = "select c from Clube c where c.serie = :serie")
    Clube consultarPelaSerie(@Param("serie") String serie);

    @Query(value = "select c from Clube c where c.rankingIffhs = :rank")
    Clube consultarPorRank(@Param("rank") Integer rank);

    @Query(value = "select c from Clube c where c.anoFundacao = :ano")
    Clube consultarPorAnoFundacao(@Param("ano") Integer ano);

    Clube findByNomeLike(String nome);

}
