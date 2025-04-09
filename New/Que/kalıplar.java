
public class kalıplar {
/*
 int[] arr = new int[5]; // Uzunluk 5
arr[0] = 10; // İlk eleman
arr[1] = 20; // İkinci eleman

int[] arr = {10, 20, 30, 40, 50};


int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}

for (int i = 0; i < arr.length / 2; i++) {
    int temp = arr[i];
    arr[i] = arr[arr.length - 1 - i];
    arr[arr.length - 1 - i] = temp;
}

 int[][] array = new int[3][3]; // 3x3 matris
array[0][0] = 5; // İlk eleman


int[][] matrix = new int[2][3];
matrix[0][0] = 1; // İlk satır, ilk sütun
matrix[0][1] = 2; // İlk satır, ikinci sütun
matrix[1][2] = 3; // İkinci satır, üçüncü sütun

int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

int[][] jaggedArray = {{1}, {2, 3}, {4, 5, 6}};

for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}

         
        Matris transpozesi alma gibi işlemler:
int[][] transpose = new int[matrix[0].length][matrix.length];
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        transpose[j][i] = matrix[i][j];
    }
}


int[] arr = new int[5]; // Uzunluk sabit: 5

int[] arr = {1, 2, 3, 4, 5};

		En büyük/küçük elemanı bulma:
		
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) max = arr[i];
}


Karmaşıklık: Düğüm ekleme/silme işlemleri O(1), ancak eleman arama O(n) karmaşıklığına sahiptir.


			Null Referenz: Liste sonu genelde null ile gösterilir

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

Node head = new Node(10); // İlk düğüm
head.next = new Node(20); // İkinci düğüm


				Listeyi Gezmek:

Node current = head;
while (current != null) {
    System.out.println(current.data);
    current = current.next;
}

		Listeye Eleman Ekleme		

Node newNode = new Node(30);
Node current = head;
while (current.next != null) {
    current = current.next;
}
current.next = newNode;


void preOrder(Node node) {
    if (node == null) return;
    System.out.print(node.data + " ");
    preOrder(node.left);
    preOrder(node.right);
}



int depth(Node root) {
    if (root == null) return 0;
    return 1 + Math.max(depth(root.left), depth(root.right));
}

---------------------Bäume 

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

		Ağaç Başlatma:

TreeNode root = new TreeNode(10);
root.left = new TreeNode(5);
root.right = new TreeNode(20);


		Preorder Traversal:


void preOrder(TreeNode node) {
    if (node == null) return;
    System.out.print(node.data + " ");
    preOrder(node.left);
    preOrder(node.right);
}


		Ağaç Derinliği Hesaplama:

int depth(TreeNode root) {
    if (root == null) return 0;
    return 1 + Math.max(depth(root.left), depth(root.right));
}



		Diziler (Arrays)
		Maksimum/Minimum Bulma Kalıbı:

int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) max = arr[i];
}
			
			Ters Çevirme Kalıbı:

for (int i = 0; i < arr.length / 2; i++) {
    int temp = arr[i];
    arr[i] = arr[arr.length - 1 - i];
    arr[arr.length - 1 - i] = temp;
}
			
			Bağlı Liste (LinkedList)
				Listeyi Tersine Çevirme:

Node prev = null;
Node current = head;
while (current != null) {
    Node next = current.next;
    current.next = prev;
    prev = current;
    current = next;
}
head = prev;

		Listeyi Gezinme ve Yazdırma:

Node current = head;
while (current != null) {
    System.out.println(current.data);
    current = current.next;
}
		
		
		Ağaçlar (Trees)
			Preorder Traversal (Kök → Sol → Sağ):

void preorder(TreeNode node) {
    if (node == null) return;
    System.out.print(node.data + " ");
    preorder(node.left);
    preorder(node.right);
}

		Ağaç Derinliği Hesaplama:


int depth(TreeNode root) {
    if (root == null) return 0;
    return 1 + Math.max(depth(root.left), depth(root.right));
}



Bağlı Listeler (Linked Lists) için toString() Yazımı

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("null"); // Listenin sonunu belirtmek için
        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list); // Çıktı: 10 -> 20 -> 30 -> null
    }
}



class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Node(" + data + ")";
    }
}

class BinaryTree {
    private TreeNode root;

    public BinaryTree(int rootData) {
        this.root = new TreeNode(rootData);
    }

    public TreeNode getRoot() {
        return root;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        traverse(root, result, 0);
        return result.toString();
    }

    private void traverse(TreeNode node, StringBuilder result, int level) {
        if (node == null) {
            return;
        }
        result.append("  ".repeat(level)) // Her seviyede girinti
              .append(node.data).append("\n");
        traverse(node.left, result, level + 1);
        traverse(node.right, result, level + 1);
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        tree.getRoot().left = new TreeNode(2);
        tree.getRoot().right = new TreeNode(3);
        tree.getRoot().left.left = new TreeNode(4);
        tree.getRoot().left.right = new TreeNode(5);

        System.out.println(tree);

       
    }
}
 */
}


