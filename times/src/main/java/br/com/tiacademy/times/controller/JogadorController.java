package br.com.tiacademy.times.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.times.core.crud.TimesController;
import br.com.tiacademy.times.domain.Jogador;
import br.com.tiacademy.times.dto.JogadorDTO;

@RestController
@RequestMapping("/jogador")
public class JogadorController extends TimesController<Jogador, JogadorDTO, Long>{
    
}
