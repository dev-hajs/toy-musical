package com.project.musical.controller;

import com.project.musical.service.MusicalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MusicalController {

    private final MusicalService musicalService;
}
