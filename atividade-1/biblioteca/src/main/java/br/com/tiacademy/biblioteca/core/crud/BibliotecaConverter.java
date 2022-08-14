package br.com.tiacademy.biblioteca.core.crud;

public interface BibliotecaConverter<T, D> {
    
    D entidadeParaDto(T entity);

    T dtoParaEntidade(D dto);

}
