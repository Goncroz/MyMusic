package com.ciandt.summit.bootcamp2022.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "Artistas")
public class Artist {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @NotNull
    private String nome;

    public Artist(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Artist() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }
}
