package com.example.grid_simulator.model;
import javax.persistence.Embeddable;


@Embeddable
public class Link {
    private String id;
    private Boolean selected;
    private String source;
    private String sourcePort;
    private String target;
    private String targetPort;
    private String type;
    private String _class;

    public Link() {}

    public Link(String id, Boolean selected, String source, String sourcePort, String target, String targetPort, String type, String _class) {
        this.id = id;
        this.selected = selected;
        this.source = source;
        this.sourcePort = sourcePort;
        this.target = target;
        this.targetPort = targetPort;
        this.type = type;
        this._class = _class;
    }

    @Override
    public String toString() {
        return "Link{" +
                "id='" + id + '\'' +
                ", selected=" + selected +
                ", source='" + source + '\'' +
                ", sourcePort='" + sourcePort + '\'' +
                ", target='" + target + '\'' +
                ", targetPort='" + targetPort + '\'' +
                ", type='" + type + '\'' +
                ", _class='" + _class + '\'' +
                '}';
    }
}
