package com.seduc2.gta.entity;

import com.seduc2.gta.entity.enuns.CategoriaCarro;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Carro {
    @Id @GeneratedValue

    private int id;
    private String nome;
    private String marca;
    private CategoriaCarro categoria;
    private String imagem;
    private String descricacao;

    public Carro(){}

    public Carro(int id, String nome, String marca, CategoriaCarro categoria, String imagem, String descricacao) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.categoria = categoria;
        this.imagem = imagem;
        this.descricacao = descricacao;
    }

    public Carro(String nome, String marca, CategoriaCarro categoria, String imagem, String descricacao) {
        this.nome = nome;
        this.marca = marca;
        this.categoria = categoria;
        this.imagem = imagem;
        this.descricacao = descricacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public CategoriaCarro getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCarro categoria) {
        this.categoria = categoria;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricacao() {
        return descricacao;
    }

    public void setDescricacao(String descricacao) {
        this.descricacao = descricacao;
    }
}
