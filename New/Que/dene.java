
public class dene {
    public static void prettyPrint(String str1, String str2) {
        if (str1.length() < str2.length()) { // Eğer str2 daha uzunsa, str2 önce yazılır
            System.out.println(str2); 
            System.out.printf("%" + str2.length() + "s\n", str1); // str1 sağa yaslanır
        } else {
            System.out.println(str1); 
            System.out.printf("%" + str1.length() + "s\n", str2); // str2 sağa yaslanır
        }
    }

    public static void main(String[] args) {
        prettyPrint("Apfel", "Banane"); // Örnek test
    }
}