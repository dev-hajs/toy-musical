package com.project.musical.repository;

import com.project.musical.model.Musical;
import com.project.musical.model.Producer;

import java.util.List;

public interface MusicalRepository {

    void createMusical(Musical musical);

    Musical findMusical(Integer musicalId);

    List<Musical> findMusicalByProducer(Producer producer);

    Musical updateMusical(Musical musical);

    void deleteMusical(Integer musicalId);
}
