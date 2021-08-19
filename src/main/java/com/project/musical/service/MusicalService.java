package com.project.musical.service;

import com.project.musical.model.Musical;
import com.project.musical.model.Producer;
import com.project.musical.repository.MusicalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MusicalService {

    private final MusicalRepository musicalRepository;


    public void createMusical(Musical musical) {
        musicalRepository.createMusical(musical);
    }

    public Musical findMusical(Integer musicalId) {
        return musicalRepository.findMusical(musicalId);
    }

    public List<Musical> findMusicalByProducer(Producer producer) {
        return musicalRepository.findMusicalByProducer(producer);
    }

    public Musical updateMusical(Musical musical) {
        return musicalRepository.updateMusical(musical);
    }

    public void deleteMusical(Integer musicalId) {
        musicalRepository.deleteMusical(musicalId);
    }
}
