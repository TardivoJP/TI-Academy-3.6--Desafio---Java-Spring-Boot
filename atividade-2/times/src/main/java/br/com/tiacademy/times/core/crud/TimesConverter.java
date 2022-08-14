package br.com.tiacademy.times.core.crud;

public interface TimesConverter<T, D> {
    
    D entidadeParaDto(T entity);

    T dtoParaEntidade(D dto);

}
