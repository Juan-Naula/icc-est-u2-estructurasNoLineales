package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nodes.Node;

public class Graph<T> {
    //List <Node<T>> nodes;
    
    //Listado de nodos conocidos
    //1ra forma
    //private List<Node<T>> conocidos;
    
    //2da forma
    private Map<Node<T>, List<Node<T>>> mapa; 

    public Graph() {
        //this.nodes = new ArrayList<Node<T>>();
        this.mapa = new HashMap<Node<T>, List<Node<T>>>();
    }

    //Insertar un vertice o nodo
    public void addNode(Node<T> node){
        mapa.putIfAbsent(node, new ArrayList<>());
    }

    //Grafo no dirigido
    public void addEdge(Node<T> n1, Node<T> n2){
        addNode(n1);
        addNode(n2);
        //List<Node<T>> listadoNodo = mapa.get(n1);
        //listadoNodo.add(n2);
        mapa.get(n1).add(n2);
        mapa.get(n2).add(n1);
    }



    public void printGraph(){
        for (Map.Entry<Node<T>, List<Node<T>>> entry : mapa.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Node<T> neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public List<Node<T>> getNeighbors(Node<T> n) {
        return mapa.get(n);
    }

}
