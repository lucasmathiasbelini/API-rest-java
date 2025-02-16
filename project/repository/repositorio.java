package br.com.br.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.br.project.modelo.Cliente;

@Repository
public interface repositorio extends CrudRepository<Cliente,Long>{
    
}
