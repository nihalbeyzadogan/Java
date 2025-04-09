
public class Wandle {

	public static char[] wandleUmInCents(String cent) {
		String ohneKomma = cent.replace(",", "");
		char[] arr = ohneKomma.toCharArray();
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '0') {
				count++;
			}else {
				break;
			}
		}
		if (count == arr.length) {
            return new char[]{'0'};
        }
		
        char[] result = new char[arr.length - count];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[count + i]; // Yeni diziye temizlenmiş veriyi kopyala
        }

        return result;
		
	}
	
    public static void main(String[] args) {
        // Test örnekleri
        System.out.println(wandleUmInCents("1,99")); // ['1', '9', '9']
        System.out.println(wandleUmInCents("0,99")); // ['9', '9']
        System.out.println(wandleUmInCents("0,90")); // ['9', '0']
        System.out.println(wandleUmInCents("0,09")); // ['9']
        System.out.println(wandleUmInCents("0,00")); // ['0']
    }
}
