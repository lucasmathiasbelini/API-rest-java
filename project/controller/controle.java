package br.com.br.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.br.project.modelo.Cliente;
import br.com.br.project.repository.repositorio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class controle {
    @Autowired
    private repositorio acao;

    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente c){
        return acao.save(c);
    };
    @GetMapping
    public Iterable<Cliente> teste(){
        return acao.findAll();
    };
    @PutMapping
    public Cliente editar(@RequestBody Cliente c){
        return acao.save(c);
    };
    @DeleteMapping("/{codigo}")
    public String deletar(@PathVariable long codigo){
        acao.deleteById(codigo);
        return "deletado";
    }
  
    }



