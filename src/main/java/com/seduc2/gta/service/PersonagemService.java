package com.seduc2.gta.service;

import com.seduc2.gta.entity.Personagem;
import com.seduc2.gta.repository.PersonagemRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonagemService {
    private final PersonagemRepository repository;

    public PersonagemService(PersonagemRepository repository) {
        this.repository = repository;
    }

    public void cadastrarPersonagem(Personagem p) {
        ;
        repository.save(p);
    }

    public List<Personagem> mostrarPersonagem() {
        return repository.findAll();
    }

    //Deletar
    public void deletar(int id) {
        repository.deleteById(id);
    }

    //Alterar
    @Transactional
    public void alterar(int id, Personagem p) {
        Personagem personagem = repository.getReferenceById(id);
        personagem.setNome(p.getNome());
        personagem.setApelido(p.getApelido());
        personagem.setCategoria(p.getCategoria());
        personagem.setDescricao(p.getDescricao());
    }

}


