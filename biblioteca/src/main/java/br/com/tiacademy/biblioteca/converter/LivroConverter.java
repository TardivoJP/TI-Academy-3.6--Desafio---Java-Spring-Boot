package br.com.tiacademy.biblioteca.converter;

import org.springframework.stereotype.Component;

import br.com.tiacademy.biblioteca.core.crud.BibliotecaConverter;
import br.com.tiacademy.biblioteca.domain.Livro;
import br.com.tiacademy.biblioteca.dto.LivroDTO;

@Component
public class LivroConverter implements BibliotecaConverter<Livro, LivroDTO> {

    @Override
    public LivroDTO entidadeParaDto(Livro entity) {
        return new LivroDTO(entity.getId(), entity.getNome(), entity.getGenero(), entity.getAnoLancamento(), entity.getQtdPaginas());
    }

    @Override
    public Livro dtoParaEntidade(LivroDTO dto) {
        return new Livro(dto.getId(), dto.getNome(), dto.getGenero(), dto.getAnoLancamento(), dto.getQtdPaginas());
    }

}
