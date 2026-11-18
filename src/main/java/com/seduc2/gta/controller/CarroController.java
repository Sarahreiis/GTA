package com.seduc2.gta.controller;
import com.seduc2.gta.entity.Carro;
import com.seduc2.gta.service.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/veiculos")
public class CarroController {

    private final CarroService service;
    public CarroController(CarroService service) {
        this.service = service;
    }

    @PostMapping
    public void criarCarro (@RequestBody Carro c){
        service.cadastrar(c);
    }

    @GetMapping
    public List<Carro>mostrar(){
        return service.mostrar();
    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable int id){

    }

    @PutMapping("/{id}")
    public void alterar (int id, @RequestBody Carro c){
        service.alterar(id,c);
    }
}
