package br.com.tiacademy.times.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.times.core.crud.TimesController;
import br.com.tiacademy.times.domain.Clube;
import br.com.tiacademy.times.dto.ClubeDTO;
import br.com.tiacademy.times.repository.ClubeRepository;

@RestController
@RequestMapping("/clube")
public class ClubeController extends TimesController<Clube, ClubeDTO, Long> {

    public ClubeRepository getRepository(){
        return (ClubeRepository) this.repository;
    }

    @GetMapping("/consultanome")
    public Clube clubePorNome(){
        return getRepository().consultarPeloNome("Palmeiras");
    }

    @GetMapping("/consultanome/{nome}")
    public Clube clubePorNomeEspecifico(@PathVariable("nome") String nome){
        return getRepository().consultarPeloNome(nome);
    }

    @GetMapping("/consultaserie")
    public Clube clubePorSerie(){
        return getRepository().consultarPelaSerie("A");
    }

    @GetMapping("/consultaserie/{serie}")
    public Clube clubePorSerieEspecifica(@PathVariable("serie") String serie){
        return getRepository().consultarPelaSerie(serie);
    }

    @GetMapping("/consultarank")
    public Clube clubePorRank(){
        return getRepository().consultarPorRank(30);
    }

    @GetMapping("/consultarank/{rank}")
    public Clube clubePorRank(@PathVariable("rank") Integer rank){
        return getRepository().consultarPorRank(rank);
    }

    @GetMapping("/consultaano")
    public Clube clubePorAnoFundacao(){
        return getRepository().consultarPorAnoFundacao(30);
    }

    @GetMapping("/consultaano/{ano}")
    public Clube clubePorAnoFundacao(@PathVariable("ano") Integer ano){
        return getRepository().consultarPorAnoFundacao(ano);
    }

    @GetMapping("/consultafindnome")
    public Clube clubePorFindNome(){
        return getRepository().findByNomeLike("Raphael Veiga");
    }

    @GetMapping("/consultafindnome/{nome}")
    public Clube clubePorFindNomeEspecifico(@PathVariable("nome") String nome){
        return getRepository().findByNomeLike(nome);
    }
    

}
