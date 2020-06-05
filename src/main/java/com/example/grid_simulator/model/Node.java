package com.example.grid_simulator.model;
import javax.persistence.Embeddable;


@Embeddable
public class Node {
    private String color;
    private String id;
    private String name;
    private Boolean selecated;
    private String type;
    private Float x;
    private Float y;
    private String _class;

    public Node() { }

    public Node(String color, String id, String name, Boolean selecated, String type, Float x, Float y, String _class) {
        this.color = color;
        this.id = id;
        this.name = name;
        this.selecated = selecated;
        this.type = type;
        this.x = x;
        this.y = y;
        this._class = _class;
    }

    @Override
    public String toString() {
        return "Node{" +
                "color='" + color + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", selecated=" + selecated +
                ", type='" + type + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", _class='" + _class + '\'' +
                '}';
    }
}
