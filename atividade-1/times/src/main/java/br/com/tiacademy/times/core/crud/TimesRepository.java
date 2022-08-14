package br.com.tiacademy.times.core.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface TimesRepository<T, ID> extends JpaRepository<T, ID> {
    
}
