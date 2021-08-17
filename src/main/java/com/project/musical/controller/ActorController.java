package com.project.musical.controller;

import com.project.musical.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ActorController {

    private final ActorService actorService;
}
