package prog1;

public class slides {

	public static double cos(double x)
	{
	double zaehler = 1.0;
	double nenner = 1.0;
	double summe = 1.0;
	double summand = 1; 
	for (int i = 2; summand > 1E-15 || 
	summand < -1E-15; i=i+2)
	{
	zaehler = zaehler * x * x * (-1);
	nenner = nenner * i * (i-1);
	summand = zaehler/nenner;
	summe = summe + summand;
	}
	return summe;
	}}
	
	
	/*public class Haus extends slides {
		public void paint (Graphics g) {
		Graphics2D g2D
		= (Graphics2D) g;
		//Haus
		g2D.setColor(Color.DARK_GRAY);
		g2D.setStroke(new BasicStroke(5)); //Pinselbreite
		
		g2D.drawRect(150, 150, 100, 100);
		//Dach
		g2D.setColor(Color.RED);
		g2D.drawLine(149, 150, 200, 75);
		g2D.drawLine(251, 150, 200, 75);
		g2D.drawLine(154, 146, 247, 146);
		//Tür
		g2D.setColor(Color.BLACK);
		g2D.drawRect(210, 225, 15, 25);
		}
		}*/
	//public static int potenz(int basis, int exponent)
	
		/*int ergebnis = 1;
		for (int i = 1; i <= exponent; i++)
		{
			ergebnis = ergebnis * basis;
		}
		return ergebnis;
		}
	public static void main(String[] args) {
		int ergebnis = potenz(3, 4);
		System.out.println(ergebnis);
		*/
		/*double summe = 0;
		double summand;
		int k = 0;
		do 
		{
			summand = 1.0/Math.pow(3, k);
			summe = summe + summand;
			k++;
		} while (summand > 1E-10 gum);
		System.out.println(summe);
		*/
		
		/*boolean getroffen =  false;
		int zu = (int) (Math.random() * 100 + 1);
		Scanner scanner = new Scanner(System.in);
		int eingabe;
		int versuch = 0;
		do
		{
		eingabe = scanner.nextInt();
		versuch++;
		if ( zu == eingabe) {
			getroffen = true;
			System.out.println("Volltreffer");
		}
		else if (zu > eingabe)
			System.out.println("grösser");
		else if (zu < eingabe)
			System.out.println("kleiner");
		}
		while ( !getroffen && versuch < 5);
		if (getroffen) System.out.println("Win");
		else System.out.println("verloren");
		*/
		
		/*
		int n = 28467;
		int quer = 0;
		while ( n > 0 ) {
			int rest = n % 10;
			quer = quer + rest;
			n = n / 10;
		}
		System.out.println(quer);
		*/
		
		/*
		int summe = 0;
		int i = 1;
		for ( ; i <= 10; i++)
		{
			summe = summe + i;
	}*/
	
		/*int n = 12;
		int zw = 1;
		for (int i = 2; i <= n; i++) {
			zw = i;
			System.out.println(zw);
		}
		*/
		
		/*int a = 4;
		int b = 15;
		int c = 5;
		if (( a < 5 || b < 10) && c != 5) {
			System.out.println("if");
		} else
		System.out.println("else");
		*/
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte geben Sie Ihr Alter ein: ");
		int alter = scanner.nextInt();
		System.out.print("Bitte geben Sie Ihre Grösse ein: ");
		int groesse = scanner.nextInt();
		boolean alterN = alter > 26 || alter < 17; 
		if ((alterN) && groesse < 165)
			System.out.println("sehr unwahrscheinlich");
		else if (alterN)
			System.out.println("unwahrs");
		else if (groesse < 165)
			System.out.println("unwahrs");
		else 
			System.out.println("möglich");
		scanner.close();
	*/
		/*byte b1 = 127;
		byte b2 = 1;
		byte erg;
		erg = (byte) (b1 + b2);
		System.out.println(erg);

		byte b3 = 127;
		byte b4 = 1;
		byte er;
		
		System.out.println(25 + 14 + "1990");
		
		/*double dis = p*p/4.0 - q;
		if (dis >= 0);
		{
			System.out.println(Math.sqrt(dis));
		}*/
		/*
		int a = 5;
		int b = 6;
		int c = 4;
		if (a <= b && a >= c)
		{	System.out.println("a");
		}*/
	
