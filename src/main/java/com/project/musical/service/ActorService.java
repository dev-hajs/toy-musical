package com.project.musical.service;

import com.project.musical.model.Actor;
import com.project.musical.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActorService {

    private final ActorRepository actorRepository;

    public void createActor(Actor actor) {
        actorRepository.createActor(actor);
    }

    public Actor findActor(Integer actorId) {
        return actorRepository.findActor(actorId);
    }

    public Actor updateActor(Actor actor) {
        return actorRepository.updateActor(actor);
    }

    public void deleteActor(Integer actorId) {
        actorRepository.deleteActor(actorId);
    }
}
