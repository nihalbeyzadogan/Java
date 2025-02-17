//package prog1;
//
//public class Baum {
//Knoten root;
//	
//	public void einfuegen(Knoten neu) {
//	if(root == null) { 
//		root = neu;
//	} else { 
//		einfuegen(root, neu);
//		}
//	}
//	
//	private void einfuegen(Knoten temp, Knoten neu) {
//		if(neu.getNachName().compareTo(temp.getNachName()) < 0) {
//			if(temp.left == null) {
//				temp.left = neu;
//			} else {
//				einfuegen(temp.left, neu);
//			} 
//		}else {
//			if(temp.right == null) {
//			}else {
//				einfuegen(temp.right, neu);
//			}
//		}
//	}
//
//
//
//public void inOrderTraversal(Knoten node) {
//    if (node != null) {
//        inOrderTraversal(node.left);
//        System.out.println(node.getNachName());
//        inOrderTraversal(node.right);
//    }
//}
//
//public void printTree() {
//inOrderTraversal(root);
//}
//}
