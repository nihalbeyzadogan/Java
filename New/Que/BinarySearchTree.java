
public class BinarySearchTree {
	Node root;
	
	public BinarySearchTree(){
		this.root=null;
	}
	
	void insert(int key) {
		root= insertRec(root, key);
	}
	
	Node insertRec(Node root, int key) {
        // Ağaç boşsa yeni düğüm oluştur
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Eğer key küçükse sola ekle
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        }
        // Eğer key büyükse sağa ekle
        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // Arama metodu
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        // Ağaç boşsa veya aranan değer kök düğümse
        if (root == null || root.key == key) {
            return root != null;
        }
        
        // Aranan değer küçükse sol alt ağaçta ara
        if (key < root.key) {
            return searchRec(root.left, key);
        }

        // Aranan değer büyükse sağ alt ağaçta ara
        return searchRec(root.right, key);
    }

    // Inorder traversal (Küçükten büyüğe sıralama)
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
}
	

