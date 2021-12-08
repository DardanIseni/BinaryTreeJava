public class BinaryTree {
    private int value;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }


    public BinaryTree addNode(int value, BinaryTree root) {

        if (root == null) {
            root = new BinaryTree(value);
            return root;
        }

        if (value < root.value)
            root.left = addNode(value,root.left);
        else if (value > root.value)
            root.right = addNode(value,root.right);
        return root;
    }

    public static void inOrderPrint(BinaryTree root) {
        if (root != null) {
            inOrderPrint(root.left);
            System.out.print(root.value + " ");
            inOrderPrint(root.right);
        }
    }

    public static BinaryTree search(BinaryTree root, int value)  {
        if (root==null || root.value==value)
            return root;
        if (root.value > value)
            return search(root.left, value);
        return search(root.right, value);
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
