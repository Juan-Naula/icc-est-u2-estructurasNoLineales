import trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
    }

    private static void runIntTree() {
        IntTree tree = new IntTree();
        tree.insert(10);
        tree.insert(3);
        tree.insert(5);
        tree.insert(15);
        System.out.println("PreOrder");
        tree.preOrder();
        System.out.println(" ");
        System.out.println("PosOrder");
        tree.posOrder();
        System.out.println(" ");
        System.out.println("InOrder");
        tree.inOrder();
        System.out.println(" ");
        System.out.println("Size: " + tree.size());
    }
}
