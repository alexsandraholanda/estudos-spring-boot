package br.com.estudospring.exercicios_spring.models.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.estudospring.exercicios_spring.models.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	

}
