package com.example.grid_simulator.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Diagram {
    @Id
    @NotNull(message = "Model cannot be null")
    private String model;

    public Diagram() { }

    public Diagram(@NotNull(message = "Model cannot be null") String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
