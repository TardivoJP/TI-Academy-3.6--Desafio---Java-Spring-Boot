package br.com.tiacademy.times.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.times.core.crud.TimesController;
import br.com.tiacademy.times.domain.Jogador;
import br.com.tiacademy.times.dto.JogadorDTO;
import br.com.tiacademy.times.repository.JogadorRepository;

@RestController
@RequestMapping("/jogador")
public class JogadorController extends TimesController<Jogador, JogadorDTO, Long>{

    public JogadorRepository getRepository(){
        return (JogadorRepository) this.repository;
    }

    @GetMapping("/consultanome")
    public Jogador jogadorPorNome(){
        return getRepository().consultarPeloNome("Dudu");
    }

    @GetMapping("/consultanome/{nome}")
    public Jogador jogadorPorNomeEspecifico(@PathVariable("nome") String nome){
        return getRepository().consultarPeloNome(nome);
    }

    @GetMapping("/consultaposicao")
    public Jogador jogadorPorPosicao(){
        return getRepository().consultarPelaPosicao("Meio-Campo");
    }

    @GetMapping("/consultaposicao/{posicao}")
    public Jogador jogadorPorPosicaoEspecifica(@PathVariable("posicao") String posicao){
        return getRepository().consultarPelaPosicao(posicao);
    }

    @GetMapping("/consultaidade")
    public Jogador jogadorPorIdade(){
        return getRepository().consultarPelaIdade(30);
    }

    @GetMapping("/consultaidade/{idade}")
    public Jogador jogadorPorIdade(@PathVariable("idade") Integer idade){
        return getRepository().consultarPelaIdade(idade);
    }

    @GetMapping("/consultafindnome")
    public Jogador jogadorPorFindNome(){
        return getRepository().findByNomeLike("Raphael Veiga");
    }

    @GetMapping("/consultafindnome/{nome}")
    public Jogador jogadorPorFindNomeEspecifico(@PathVariable("nome") String nome){
        return getRepository().findByNomeLike(nome);
    }
    
}
