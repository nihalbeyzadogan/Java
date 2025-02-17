package lektion5;

import java.util.Iterator;

public class reihenwert {

	public static void main(String[] args) {

        System.out.println("Ersten fünf Glieder der Reihe:");
        for (int k = 1; k <= 5; k++) {
            double term = 6 * (1.0 / (k * k));
            System.out.printf("a_%d = %.5f%n", k, term);
        }

        System.out.println("\nBerechnung der Reihe:");
        double sum = 0.0; 
        double previousSum = 0.0;  
        int k = 1;  
        double threshold = 1e-5; 

        while (true) {
            sum += 6 * (1.0 / (k * k));  
            System.out.printf("Iteration %d: Summe = %.5f%n", k, sum);

            if (Math.abs(sum - previousSum) < threshold) {
                break;  
            }

            previousSum = sum;  
            k++;
        }

        System.out.println("Berechnung beendet. Endwert der Reihe: " + sum);

        System.out.println("\nAnalyse der Auswirkungen von Faktor 6:");
        System.out.println("Ohne Faktor 6 wäre die Summe nur die Basissumme der Reihe.");
        double baseSum = 0.0;
        for (int i = 1; i <= k; i++) {
            baseSum += (1.0 / (i * i));
        }
        System.out.printf("Basissumme (ohne Faktor 6): %.5f%n", baseSum);
        System.out.printf("Mit Faktor 6 multipliziert: %.5f%n", 6 * baseSum);
    }
}