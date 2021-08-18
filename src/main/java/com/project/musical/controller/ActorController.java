package com.project.musical.controller;

import com.project.musical.model.Actor;
import com.project.musical.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class ActorController {

    private final ActorService actorService;

    @PostMapping("/actor/create")
    @ResponseBody
    public void createActor(@RequestBody Actor actor) {
        actorService.createActor(actor);
    }

    @GetMapping("/actor/get")
    @ResponseBody
    public Actor getActor(@RequestParam Integer actorId) {
        return actorService.findActor(actorId);
    }

    @PostMapping("/actor/update")
    @ResponseBody
    public Actor updateActor(@RequestBody Actor actor) {
        return actorService.updateActor(actor);
    }

    @PostMapping("/actor/delete")
    @ResponseBody
    public void deleteActor(@RequestBody Integer actorId) {
        actorService.deleteActor(actorId);
    }
}
