package br.com.tiacademy.biblioteca.converter;

import org.springframework.stereotype.Component;

import br.com.tiacademy.biblioteca.core.crud.CrudConverter;
import br.com.tiacademy.biblioteca.domain.Autor;
import br.com.tiacademy.biblioteca.dto.AutorDTO;

@Component
public class AutorConverter implements CrudConverter<Autor, AutorDTO> {

    @Override
    public AutorDTO entidadeParaDto(Autor entity) {
        return new AutorDTO(entity.getId(), entity.getNome(), entity.getAnoNascimento(), entity.getAnoFalecimento());
    }

    @Override
    public Autor dtoParaEntidade(AutorDTO dto) {
        return new Autor(dto.getId(), dto.getNome(), dto.getAnoNascimento(), dto.getAnoFalecimento());
    }

}
