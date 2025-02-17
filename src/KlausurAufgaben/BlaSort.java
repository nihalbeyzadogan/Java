package KlausurAufgaben;

  class BlaSort {
	 private int [] arr;
	 
	 
	 public BlaSort(int[] arr) {
		 this.arr=arr;
	 }
	 
	 public void mischen() {
		 int indexA = (int) (Math.random() * arr.length);
		 int indexB = (int) (Math.random() * arr.length);
		 
		 while(indexA == indexB) {
			 indexB = (int) (Math.random() * arr.length);
		 }
		 
		 int tmp = arr[indexA];
		 arr[indexA]=arr[indexB];
		 arr[indexB] = tmp;
				 
	 }
	 
	 public void ausgabe() {
		 System.out.print("[ ");
		 int i;
		 for (i = 0; i< arr.length - 1 ; i++) {
			 System.out.print(arr[i] + ", ");
		 }
		System.out.println(arr[i] + " ]");
	 }
	 
	 public boolean aufsteigend() {
		 boolean ergebnis = true;
		 int i;
		 for ( i = 1; i < arr.length ; i++) {
			 if(arr[i] < arr[i - 1]) {
				 return false;
			 }
		 }
		 return true;
	 }
	 
	 public int sortieren() {
		 int ergebnis = 0;
		 while(!aufsteigend()) {
			 mischen();
			 ergebnis++;
		 }
		 return ergebnis;
	 }
	 
	 public static void main(String[] args) {
		 int[] arr2 = new int[5];
		 for(int i=0; i<arr2.length; i++) {
			 arr2[i] = (int)(Math.random() * 1000000) + 1;
		 }
		 
		 BlaSort instanz = new BlaSort(arr2);
	      System.out.println("Unsortierte Array:");
	        instanz.ausgabe();

	        int ergebnis = instanz.sortieren();
	        System.out.println("Sortierte Array:");
	        instanz.ausgabe();

	        System.out.println("Anzahl der Versuche: " + ergebnis);
	    }
	
	
	 }

