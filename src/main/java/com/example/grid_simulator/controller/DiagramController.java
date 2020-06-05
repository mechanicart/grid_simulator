package com.example.grid_simulator.controller;

import com.example.grid_simulator.model.Diagram;
import com.example.grid_simulator.service.IDiagramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController()
@RequestMapping("/v1/api/diagram")
public class DiagramController {
    @Autowired
    private static IDiagramService service;

    @RequestMapping(
            value = "/",
            method = RequestMethod.GET)
    public List<Diagram> find_all(){
        return service.findAll();
    }

    @RequestMapping(
            value = "/",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(code = HttpStatus.OK)
    public Boolean add(@RequestBody Diagram diagram){
        System.out.println(diagram);
        return true;
    }
}
