package br.com.tiacademy.biblioteca.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.biblioteca.core.crud.BibliotecaController;
import br.com.tiacademy.biblioteca.domain.Livro;
import br.com.tiacademy.biblioteca.dto.LivroDTO;

@RestController
@RequestMapping("/livro")
public class LivroController extends BibliotecaController<Livro, LivroDTO, Long> {

}
