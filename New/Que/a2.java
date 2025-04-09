import java.util.Scanner;

public class a2 {
	public static char[][] text(int random){;
    char[][] field = new char[5][8]; 

    for (int i = 0; i < 8; i++) {
        field[0][i] = 'o'; 
    }

    for (int i = 1; i < 4; i++) {
        for (int j = 0; j < 8; j++) {
            field[i][j] = ' ';
        }
    }

    for (int i = 0; i < 8; i++) {
        field[4][i] = ' ';
    }
    field[4][random] = 'V';

    return field;
}

public static void printField(char[][] field) {
    for (char[] row : field) {
        System.out.println(row);
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int random = (int) (Math.random() * 8); 

    char[][] game = text(random);
    System.out.println("Spiel gestartet! Steuerung: 'a' (links), 'd' (rechts), 'b' (Beenden)");

    while (true) {
        printField(game); 
        System.out.print("Eingabe: ");
        char c = scanner.next().charAt(0);

        if (c == 'b') { 
            System.out.println("Beenden...");
            break;
        }

        game[4][random] = ' ';

        if (c == 'a' && random > 0) {
            random--;
        } else if (c == 'd' && random < 7) {
            random++;
        }

        game[4][random] = 'V';
    }

    scanner.close();
}
}