package com.seduc2.gta.service;
import com.seduc2.gta.entity.Carro;
import com.seduc2.gta.repository.CarroRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    private final CarroRepository repository;
    public CarroService(CarroRepository repository) {
        this.repository = repository;
    }

    public void cadastrar (Carro c){
        repository.save(c);
    }
    public List<Carro> mostrar(){
        return repository.findAll();
    }
    public void deletar(int id){
        repository.deleteById(id);
    }

    @Transactional
    public void alterar (int id, Carro c){
        Carro carro=repository.getReferenceById(id);
        carro.setNome(c.getNome());
        carro.setMarca(c.getMarca());
        carro.setCategoria(c.getCategoria());
        carro.setImagem(c.getImagem());
        carro.setDescricacao(c.getDescricacao());
    }
}
