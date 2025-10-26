package com.teranga.tourconnected.controller;

import com.teranga.tourconnected.model.Histoire;

import com.teranga.tourconnected.service.HistoireService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/histoires")
@RequiredArgsConstructor
public class HistoireController {

    private final HistoireService service;


    @GetMapping
    public List<Histoire> getHistoires() {
        return service.getAllHistoires();
    }


    @PostMapping
    public Histoire addHistoire(@RequestBody Histoire histoire) {
        return service.addHistoire(histoire);
    }
}
