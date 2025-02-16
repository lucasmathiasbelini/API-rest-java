package br.com.br.project.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.br.project.modelo.Produto;
import br.com.br.project.repository.Produtorepositorio;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class controlleProduto {

    @Autowired
    private Produtorepositorio db;
    @PostMapping
    public Produto enviar(@RequestBody Produto p){
        return db.save(p);
    };
    @GetMapping("/{id}")
    public Iterable<Produto> teste(){
       return db.findAll();
    };
    @PutMapping("/{id}")
    public Produto editar(@RequestBody Produto p) {
        return db.save(p);
    }
    
}