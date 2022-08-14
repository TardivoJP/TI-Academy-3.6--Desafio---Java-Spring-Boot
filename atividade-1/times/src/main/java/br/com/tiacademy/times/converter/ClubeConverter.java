package br.com.tiacademy.times.converter;

import org.springframework.stereotype.Component;

import br.com.tiacademy.times.core.crud.TimesConverter;
import br.com.tiacademy.times.domain.Clube;
import br.com.tiacademy.times.dto.ClubeDTO;

@Component
public class ClubeConverter implements TimesConverter<Clube, ClubeDTO> {

    @Override
    public ClubeDTO entidadeParaDto(Clube entity) {
        return new ClubeDTO(entity.getId(), entity.getNome(), entity.getSerie(), entity.getRankingIffhs(), entity.getAnoFundacao());
    }

    @Override
    public Clube dtoParaEntidade(ClubeDTO dto) {
        return new Clube(dto.getId(), dto.getNome(), dto.getSerie(), dto.getRankingIffhs(), dto.getAnoFundacao());
    }
    
}
