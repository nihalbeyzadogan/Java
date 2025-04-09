
public class Mosaikpuzzle {
	private boolean[][] motiv;
	private int groesse;
	
	public Mosaikpuzzle(boolean[][] motiv ) {
		this.motiv=motiv;
		this.groesse = motiv.length;
	}
	
	public int ermittleHinweiszahl(int zeile, int spalte) {
		int count = 0;
		
	    for (int i = -1; i <= 1; i++) { // Satır için -1, 0, 1 dolaş
	        for (int j = -1; j <= 1; j++) { // Sütun için -1, 0, 1 dolaş
	        	int neueZeile = zeile + i;
                int neueSpalte = spalte + j;

                // Matris sınırları içinde mi?
                if (neueZeile >= 0 && neueZeile < groesse && neueSpalte >= 0 && neueSpalte < groesse) {
                    if (motiv[neueZeile][neueSpalte]) {
                        count++; // Siyah hücreleri say
                    }
                }
	        }
	    }
        return count;
	}
	
    // c) Tüm matrisi ipucu sayılarıyla dönüştürür
    public int[][] generiereHinweismatrix() {
        int[][] hinweise = new int[groesse][groesse];

        for (int i = 0; i < groesse; i++) {
            for (int j = 0; j < groesse; j++) {
                hinweise[i][j] = ermittleHinweiszahl(i, j); // Her hücre için hesapla
            }
        }

        return hinweise;
    }

    // Matrisleri ekrana yazdırma
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    // Ana program (Test için)
    public static void main(String[] args) {
        boolean[][] beispielMotiv = {
            {false, false, true,  false, false},
            {false, true,  true,  false, false},
            {false, false, true,  false, false},
            {true,  false, false, true,  false},
            {false, false, false, false, false}
        };

        Mosaikpuzzle puzzle = new Mosaikpuzzle(beispielMotiv);
        int[][] hinweismatrix = puzzle.generiereHinweismatrix();

        // Çıktıyı yazdır
        printMatrix(hinweismatrix);
    }
}
