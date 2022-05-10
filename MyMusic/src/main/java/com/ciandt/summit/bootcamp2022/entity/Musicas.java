package com.ciandt.summit.bootcamp2022.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "Musicas")
public class Musicas {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @NotNull
    private String nome;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "artistaId", nullable = true)
    private Artist artistas;

    public Musicas(String id, String nome, Artist artistas) {
        this.id = id;
        this.nome = nome;
        this.artistas = artistas;
    }

    public Musicas() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome(String nome) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Artist getArtistas() {
        return artistas;
    }

    public void setArtistas(Artist artistas) {
        this.artistas = artistas;
    }
}
