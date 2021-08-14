package com.project.musical.repository;

import com.project.musical.model.Musical;
import com.project.musical.model.Producer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaMusicalRepository implements MusicalRepository {
    @Override
    public void createMusical(Musical musical) {

    }

    @Override
    public Musical findMusical(Integer musicalId) {
        return null;
    }

    @Override
    public List<Musical> findMusicalByProducer(Producer producer) {
        return null;
    }

    @Override
    public Musical updateMusical(Musical musical) {
        return null;
    }

    @Override
    public void deleteMusical(Integer musicalId) {

    }
}
