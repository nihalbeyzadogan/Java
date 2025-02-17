//package prog1;
//
//public class TekYonluListe {
//	Node head = null;
//	Node tail = null;
//	
//	void basaEkle(int x) {
//		Node eleman = new Node();
//		eleman.data = x;
//		
//		if (head == null) {
//			eleman.next=null;
//			head = eleman;
//			tail = eleman;
//			System.out.println("liste oluşturuldu");
//		}else {
//			eleman.next=head;
//			head=eleman;
//			System.out.println("Yeni eleman basa eklendi");
//				}
//		
//			}
//	
//	void sonaEkle(int x) {
//		Node eleman = new Node();
//		eleman.data = x;
//		
//		if (head == null) {
//			eleman.next=null;
//			head = eleman;
//			tail = eleman;
//			System.out.println("liste oluşturuldu");
//		}else {
//			eleman.next=null;
//			tail.next=eleman;
//			tail = eleman;
//			System.out.println("Yeni eleman sona eklendi");
//				}
//		
//			}
//	
//	void yazdır() {
//		if (head == null) {
//			System.out.println("liste bos");
//		}else {
//			Node temp = head;
//			while(temp!=null) {
//				
//				System.out.print(temp.data + " ");
//				temp = temp.next;
//			}
//			
//		}
//		
//	}
//}







