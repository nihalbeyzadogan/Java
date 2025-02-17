package Linkedlist;

import prog1.Node1;

public class Funktion {
	Node head = null;
	Node tail = null;
	
	 void sonaEkle(int x) {
		Node eleman = new Node();
		eleman.data= x;
		if(head == null) {
			eleman.next=null;
			head =eleman;
			tail = eleman;
		}else {
			eleman.next=null;
			tail.next=eleman;
			tail=eleman;
			
		}
	}
	
	
	  void tersCevir() {
	        Node prev = null; // Önceki düğüm
	        Node current = head; // Mevcut düğüm
	        Node next = null; // Sonraki düğüm

	        while (current != null) {
	            next = current.next; // Sonraki düğümü sakla
	            current.next = prev; // Mevcut düğümü tersine çevir
	            prev = current; // Önceki düğümü güncelle
	            current = next; // Bir sonraki düğüme geç
	        }
	        head = prev; // Yeni baş düğüm
	    }

	
	
	 void yazdırma() {
		if(head == null) {
			System.out.println("liste boş");
		}else {
			Node temp = head;
			while (temp!=null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
						
			}
		}
	}
}
