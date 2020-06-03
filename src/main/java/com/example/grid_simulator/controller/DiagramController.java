package com.example.grid_simulator.controller;

import com.example.grid_simulator.model.Diagram;
import com.example.grid_simulator.service.IDiagramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/v1/api/diagram")
public class DiagramController {
    @Autowired
    IDiagramService service;

    @RequestMapping(
            value = "/",
            method = RequestMethod.GET)
    public List<Diagram> find_all(){
        return service.findAll();
    }
}
