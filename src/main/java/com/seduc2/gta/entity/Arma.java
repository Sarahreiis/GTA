package com.seduc2.gta.entity;
import com.seduc2.gta.entity.enuns.CategoriaArma;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arma {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nome;
    private CategoriaArma categoria;
    private String fabricante;
    private String imagem;
    private String descricao;

     public Arma (){}

    public Arma(int id, String nome, CategoriaArma categoria, String fabricante, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Arma(String nome, CategoriaArma categoria, String fabricante, String imagem, String descricao) {
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
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

    public CategoriaArma getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaArma categoria) {
        this.categoria = categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
