package br.com.tiacademy.times.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import br.com.tiacademy.times.core.crud.TimesRepository;
import br.com.tiacademy.times.domain.Jogador;

@Repository
public interface JogadorRepository extends TimesRepository<Jogador, Long>{
    
    @Query(value = "select j from Jogador j where j.nome = :nome")
    Jogador consultarPeloNome(@Param("nome") String nome);

    @Query(value = "select j from Jogador j where j.posicao = :posicao")
    Jogador consultarPelaPosicao(@Param("posicao") String posicao);

    @Query(value = "select j from Jogador j where j.idade = :idade")
    Jogador consultarPelaIdade(@Param("idade") Integer idade);

    Jogador findByNomeLike(String nome);

}
