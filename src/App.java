import trees.IntTree;
import trees.Tree;

import java.util.List;

import graphs.Graph;
import models.Persona;
import nodes.Node;

public class App {
    public static void main(String[] args) throws Exception {
        //runIntTree();
        //runTree();
        runGraph();
    }

    private static void runGraph() {
        Graph<String> graph = new Graph<>();
        
        Node<String> nA = new Node<String>("A");
        Node<String> nB = new Node<String>("B");
        Node<String> nC = new Node<String>("C");
        Node<String> nD = new Node<String>("D");

        graph.addNode(nA);
        graph.addEdge(nA, nB);
        graph.addEdge(nA, nC);
        graph.addEdge(nB, nD);
        graph.addEdge(nC, nD);

        graph.printGraph();

        //Conectados de A
        List<Node<String>> neighbors = graph.getNeighbors(nA);
        System.out.print("Neighbors de A: ");
        for (Node<String> neighbor : neighbors) {
            System.out.print(neighbor + "");
        }

    }

    private static void runTree() {
        Tree<Persona> tree = new Tree<Persona>();
        tree.insert(new Persona("Pablo", 21));
        tree.insert(new Persona("Maria", 23));
        tree.insert(new Persona("Ana", 25));
        tree.insert(new Persona("Pedro", 23));
        tree.insert(new Persona("Luis", 19));
        tree.inOrder();

        Persona findPerson = tree.searchByAge(23);
        if (findPerson != null) {
            System.out.println("Se encontro: " + findPerson);
        }else{
            System.out.println("No se encontro");
        }
    }

    private static void runIntTree() {
        IntTree intTree = new IntTree();
        intTree.insert(10);
        intTree.insert(3);
        intTree.insert(5);
        intTree.insert(15);
        System.out.println("PreOrder");
        intTree.preOrder();
        System.out.println(" ");
        System.out.println("PosOrder");
        intTree.posOrder();
        System.out.println(" ");
        System.out.println("InOrder");
        intTree.inOrder();
        System.out.println(" ");
        System.out.println("Size: " + intTree.size());
    }
}
