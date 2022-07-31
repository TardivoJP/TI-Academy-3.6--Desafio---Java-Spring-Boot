package br.com.tiacademy.biblioteca.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.biblioteca.core.crud.CrudController;
import br.com.tiacademy.biblioteca.domain.Editora;
import br.com.tiacademy.biblioteca.dto.EditoraDTO;

@RestController
@RequestMapping("/editora")
public class EditoraController extends CrudController<Editora, EditoraDTO, Long> {

}
