package SS12.Java_Collection_Framework.BinarySearchTree;

public interface Tree<E> {
    boolean insert(E e);

    void inorder();

    int getSize();

    boolean search(E e);

    void postorder();

    void preorder();
}
