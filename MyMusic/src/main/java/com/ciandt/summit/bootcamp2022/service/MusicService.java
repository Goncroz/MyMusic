package com.ciandt.summit.bootcamp2022.service;

import com.ciandt.summit.bootcamp2022.entity.Musicas;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MusicService  {

    public List<Musicas> findMusicByName(String nome);


}
