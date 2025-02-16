package br.com.br.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.br.project.modelo.Produto;
@Repository
public interface Produtorepositorio extends CrudRepository<Produto,Long>{
    
}
