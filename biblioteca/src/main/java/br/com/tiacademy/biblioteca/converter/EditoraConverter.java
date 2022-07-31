package br.com.tiacademy.biblioteca.converter;

import org.springframework.stereotype.Component;

import br.com.tiacademy.biblioteca.core.crud.BibliotecaConverter;
import br.com.tiacademy.biblioteca.domain.Editora;
import br.com.tiacademy.biblioteca.dto.EditoraDTO;

@Component
public class EditoraConverter implements BibliotecaConverter<Editora, EditoraDTO> {

    @Override
    public EditoraDTO entidadeParaDto(Editora entity) {
        return new EditoraDTO(entity.getId(), entity.getNome(), entity.getAnoFundacao());
    }

    @Override
    public Editora dtoParaEntidade(EditoraDTO dto) {
        return new Editora(dto.getId(), dto.getNome(), dto.getAnoFundacao());
    }
    
}
