package br.com.projeto.barbosa.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.barbosa.modelo.Pessoa;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Pessoa, Integer>{

	// retornar lista de pessoas findall
	
	List<Pessoa> findAll();
	
	//selecionar lista de pessoas pelo codigo
	
	Pessoa findByCodigo(int codigo);
	
}
