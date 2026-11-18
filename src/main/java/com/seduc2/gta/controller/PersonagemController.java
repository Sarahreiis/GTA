package com.seduc2.gta.controller;
import com.seduc2.gta.entity.Personagem;
import com.seduc2.gta.service.PersonagemService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/personagens")
public class PersonagemController {

    private final PersonagemService service;
    public PersonagemController(PersonagemService service) {
        this.service = service;
    }

    @PostMapping
    public void criarPersonegem ( @RequestBody Personagem p){
        service.cadastrarPersonagem(p);
    }

    @GetMapping
    public List<Personagem> mostrarPersonagem(){
        return service.mostrarPersonagem();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        service.deletar(id);
    }

    @PutMapping
    public void alterar(int id,@RequestBody Personagem p){
        service.alterar(id,p);
    }
}
