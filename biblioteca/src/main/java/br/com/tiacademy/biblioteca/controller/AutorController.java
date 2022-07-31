package br.com.tiacademy.biblioteca.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.biblioteca.core.crud.CrudController;
import br.com.tiacademy.biblioteca.domain.Autor;
import br.com.tiacademy.biblioteca.dto.AutorDTO;

@RestController
@RequestMapping("/autor")
public class AutorController extends CrudController<Autor, AutorDTO, Long>{
    
}
