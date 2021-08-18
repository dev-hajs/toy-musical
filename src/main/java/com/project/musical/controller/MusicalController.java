package com.project.musical.controller;

import com.project.musical.model.Musical;
import com.project.musical.service.MusicalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class MusicalController {

    private final MusicalService musicalService;

    @PostMapping("/musical/create")
    @ResponseBody
    public void createMusical(@RequestBody Musical musical) {
        musicalService.createMusical(musical);
    }

    @GetMapping("/musical/get")
    @ResponseBody
    public Musical getMusical(@RequestParam Integer musicalId) {
        return musicalService.findMusical(musicalId);
    }

    @PostMapping("/musical/update")
    @ResponseBody
    public Musical updateMusical(@RequestBody Musical musical) {
        return musicalService.updateMusical(musical);
    }

    @PostMapping("/musical/delete")
    @ResponseBody
    public void deleteMusical(@RequestBody Integer musicalId) {
        musicalService.deleteMusical(musicalId);
    }
}
