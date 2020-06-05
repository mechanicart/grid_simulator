package com.example.grid_simulator.service;

import com.example.grid_simulator.model.Diagram;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class DiagramService implements IDiagramService {
    @Override
    public List<Diagram> findAll() {
        return null;
    }
}
