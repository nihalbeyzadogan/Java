
public class BSTDemo {

	public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Eleman ekleme
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Inorder traversal (küçükten büyüğe yazdır)
        System.out.print("Inorder traversal: ");
        tree.inorder();

        // Eleman arama
        System.out.println("\nElement 40 exists: " + tree.search(40));
        System.out.println("Element 100 exists: " + tree.search(100));
	}

}
