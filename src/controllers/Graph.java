package controllers;
import java.util.ArrayList;
import java.util.List;
/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;*/
import models.Node;

public class Graph {

    private List<Node> nodes;

    public Graph() {
        this.nodes =  new ArrayList<>();
    }

    public Node addNode(int value) {
        Node node = new Node(value);
        nodes.add(node);
        return node;
    }

    

    public void addEdge(Node src, Node dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);

    }
    public void addEdgeUni(Node src , Node des){
        src.addNeighbor(des);
    }

    // Metodo para imprimir el grafo
    // Para cada ndoo imprime sus conecciones
    // Vertex 0 : 
    public void printGraph() {
    for (Node node : nodes) {
        System.out.print("Vertex " + node.getValue() + ":");
        for (Node neighbor : node.getNeighbors()) {
            System.out.print(" -> " + neighbor.getValue());
        }
        System.out.println(); // salto de línea solo una vez al final
    }
}

    
 


    public void getDFS(Node startNode) {
        
    }

    private void getDFSUtil(Node node, boolean[] visited) {

    }

    public void getBFS(Node starNode) {

    }

    public int[][] getAdjacencyMatrix() {
        return null;

    }

    public void printAdjacencyMatrix() {
        
    }

}
