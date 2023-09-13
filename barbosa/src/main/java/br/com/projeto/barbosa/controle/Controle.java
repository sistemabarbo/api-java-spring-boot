package br.com.projeto.barbosa.controle;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.barbosa.modelo.Pessoa;
import br.com.projeto.barbosa.repositories.Repository;

@RestController
public class Controle {

	
	@GetMapping("")
	public String mesagem() {
		return "Danilo de sousa nascimento barbosa!!";
	}
	
	// vincular classe pessoa com a classe controle
	
	@PostMapping("/pessoa")
	public Pessoa pessoa(@RequestBody Pessoa p) {
		return p;
	}
	
	// CADASTRAR DADOS NO BANCO DE DADOS
	@Autowired
	private Repository acao;
	
	@PostMapping("/api")
	public Pessoa cadastrar(@RequestBody Pessoa obj) {
		return acao.save(obj);
	}
	
	// selecionar
	
	@GetMapping("/api")
	public List<Pessoa> selecionar() {
		return acao.findAll();
	}
	
	@GetMapping("/api/{codigo}")
	public Pessoa selecionarPelocodigo(@PathVariable int codigo) {
		return acao.findByCodigo(codigo);
	}
	@PutMapping("/api")
	public Pessoa editar(@RequestBody Pessoa obj) {
		return acao.save(obj);
	}
	
	@DeleteMapping("/api/{codigo}")
	public void delete(@PathVariable int codigo) {
		Pessoa obj = selecionarPelocodigo(codigo);
		acao.delete(obj);
	}
	
	
	
}












