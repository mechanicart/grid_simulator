package com.example.grid_simulator.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="Diagram")
public class Diagram {

    @Id
    @Column(name = "DIAGRAM_ID")
    @NotNull(message = "id cannot be null")
    private String id;

    @ElementCollection
    private List<Node> nodes;

    @ElementCollection
    private List<Link> links;

    private Float offsetX;
    private Float offsetY;
    private Integer zoom;

    public Diagram() { }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Float offsetX) {
        this.offsetX = offsetX;
    }

    public Float getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Float offsetY) {
        this.offsetY = offsetY;
    }

    public Integer getZoom() {
        return zoom;
    }

    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Diagram(@NotNull(message = "id cannot be null") String id, List<Node> nodes, List<Link> links, Float offsetX, Float offsetY, Integer zoom) {
        this.id = id;
        this.nodes = nodes;
        this.links = links;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.zoom = zoom;
    }

    @Override
    public String toString() {
        return "Diagram{" +
                "id='" + id + '\'' +
                ", nodes=" + nodes +
                ", links=" + links +
                ", offsetX=" + offsetX +
                ", offsetY=" + offsetY +
                ", zoom=" + zoom +
                '}';
    }
}
