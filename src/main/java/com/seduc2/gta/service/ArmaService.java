package com.seduc2.gta.service;
import com.seduc2.gta.entity.Arma;
import com.seduc2.gta.repository.ArmaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmaService {
   private final ArmaRepository repository;
    public ArmaService(ArmaRepository repository) {
        this.repository = repository;
    }

    public void cadastrar (Arma a){
        repository.save(a);
    }

    public List<Arma> mostrar(){
        return repository.findAll();
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    @Transactional
    public void alterar(int id, Arma a){
        Arma arma =repository.getReferenceById(id);
        arma.setNome(a.getNome());
        arma.setCategoria(a.getCategoria());
        arma.setFabricante(a.getFabricante());
        arma.setImagem(a.getImagem());
        arma.setDescricao(a.getDescricao());
    }
}
