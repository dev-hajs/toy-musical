package com.project.musical.repository;

import com.project.musical.model.Actor;

import java.util.List;

public interface ActorRepository {

    void createActor(Actor actor);

    Actor findActor(Integer actorId);

    List<Actor> findActorByMusicalId (Integer musicalId);

    Actor updateActor(Actor actor);

    void deleteActor(Integer actorId);

}
