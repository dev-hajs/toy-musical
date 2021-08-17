package com.project.musical.service;

import com.project.musical.repository.MusicalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActorService {

    private final MusicalRepository musicalRepository;


}
