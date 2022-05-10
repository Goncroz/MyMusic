package com.ciandt.summit.bootcamp2022.service;

import com.ciandt.summit.bootcamp2022.entity.Musicas;
import com.ciandt.summit.bootcamp2022.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImp implements MusicService{

    @Autowired
    private MusicRepository musicRepository;

    @Override
    public List<Musicas> findMusicByName(String nome) {

       List<Musicas> musicas = musicRepository.findMusicByName(nome);

        return musicas;
    }
}
