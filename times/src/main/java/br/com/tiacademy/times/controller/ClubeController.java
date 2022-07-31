package br.com.tiacademy.times.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.times.core.crud.TimesController;
import br.com.tiacademy.times.domain.Clube;
import br.com.tiacademy.times.dto.ClubeDTO;

@RestController
@RequestMapping("/clube")
public class ClubeController extends TimesController<Clube, ClubeDTO, Long> {

}
