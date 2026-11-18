package com.seduc2.gta.entity;
import com.seduc2.gta.entity.enuns.Categoria;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Personagem {
@Id @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int id;
    private String nome;
    private String apelido;
    private Categoria categoria;
    private String Imagem;
    private String descricao;

    public Personagem (){}

    public Personagem(int id, String nome, String apelido, Categoria categoria, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.categoria = categoria;
        Imagem = imagem;
        this.descricao = descricao;
    }

    public Personagem(String nome, String apelido, Categoria categoria, String imagem, String descricao) {
        this.nome = nome;
        this.apelido = apelido;
        this.categoria = categoria;
        Imagem = imagem;
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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getImagem() {
        return Imagem;
    }

    public void setImagem(String imagem) {
        Imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}