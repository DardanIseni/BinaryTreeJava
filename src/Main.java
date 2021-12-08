public class Main {
    public static void main(String[] args) {

        BinaryTree root;

        BinaryTree nodeA = new BinaryTree(10);
        BinaryTree nodeB = new BinaryTree(5);
        BinaryTree nodeC = new BinaryTree(20);
        root = nodeA;

        root.setLeft(nodeB);
        root.setRight(nodeC);
        root.addNode(4,root);
        BinaryTree.inOrderPrint(root);
        BinaryTree founded = BinaryTree.search(root,5);
    }
}
