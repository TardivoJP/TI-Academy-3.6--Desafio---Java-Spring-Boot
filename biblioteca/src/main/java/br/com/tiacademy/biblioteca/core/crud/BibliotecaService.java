package br.com.tiacademy.biblioteca.core.crud;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public abstract class BibliotecaService<T, ID> {

    @Autowired
    protected BibliotecaRepository<T, ID> repository;

    public Page<T> paginada(Pageable pageable){
        return repository.findAll(pageable);
    }

    public List<T> listar(){
        return repository.findAll();
    }

    public T porId(ID id){
        return repository.findById(id).orElse(null);
    }

    public T criar(T entity){
        return repository.save(entity);
    }

    public void excluir(ID id){
        repository.deleteById(id);
    }

    public T editar(ID id, T entity){
        var recuperado = porId(id);

        if(Objects.isNull(recuperado)){
            throw new RuntimeException("Não foi encontrado");
        }

        var entidadeSalvar = editarEntidade(recuperado, entity);

        return repository.save(entidadeSalvar);
    }

    protected abstract T editarEntidade(T recuperado, T entity);
    
}
