package com.ciandt.summit.bootcamp2022.controller;

import com.ciandt.summit.bootcamp2022.entity.Musicas;
import com.ciandt.summit.bootcamp2022.service.MusicService;
import com.ciandt.summit.bootcamp2022.service.MusicServiceImp;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1/music")
public class MusicController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(MusicServiceImp.class);

    private Map<String, Object> response = new HashMap<>();

   @Autowired
   private MusicService musicService;

    /*@GetMapping
    public ResponseEntity<String> get() {

        return ResponseEntity.ok("67f5976c-eb1e-404e-8220-2c2a8a23be47");
    }*/

    @GetMapping
    public ResponseEntity<?> getMusicByName(@RequestParam ("filtro") String nome){
        try{
            List<Musicas> musicas = musicService.findMusicByName(nome);
           response.clear();
           response.put("musicas", musicas);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        catch (Exception e){
            throw new RuntimeException("Erro ao realizar busca");
        }

    }
}
