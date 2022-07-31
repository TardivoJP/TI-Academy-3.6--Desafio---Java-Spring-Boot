package br.com.tiacademy.times.converter;

import org.springframework.stereotype.Component;

import br.com.tiacademy.times.core.crud.TimesConverter;
import br.com.tiacademy.times.domain.Jogador;
import br.com.tiacademy.times.dto.JogadorDTO;

@Component
public class JogadorConverter implements TimesConverter<Jogador, JogadorDTO> {

    @Override
    public JogadorDTO entidadeParaDto(Jogador entity) {
        return new JogadorDTO(entity.getId(), entity.getNome(), entity.getPosicao(), entity.getIdade());
    }

    @Override
    public Jogador dtoParaEntidade(JogadorDTO dto) {
        return new Jogador(dto.getId(), dto.getNome(), dto.getPosicao(), dto.getIdade());
    }

}
