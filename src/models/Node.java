package models;
import java.util.ArrayList;
import java.util.List;

public class Node {

    private int value;
    private List<Node> neighbors;

    // Constructor
    public Node(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    // Getter del valor
    public int getValue() {
        return value;
    }

    // Obtener vecinos
    public List<Node> getNeighbors() {
        return neighbors;
    }

    // Agregar un vecino
    public void addNeighbor(Node neighbor) {
        neighbors.add(neighbor);
    }
}
