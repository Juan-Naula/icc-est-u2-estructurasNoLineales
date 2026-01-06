import trees.IntTree;
import trees.Tree;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        //runIntTree();
        runTree();
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
