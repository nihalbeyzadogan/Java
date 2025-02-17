package KlausurAufgaben;

public class Polizie {
	public static double errechneMasse(double volumen, double alkvolanteil){
		final double DICHTE = 0.8;

		return volumen * alkvolanteil * DICHTE;
	}

	public static double errechneAlkKonzentration(double alkmasse, double gewicht, char typ){
		if(typ != 'm' && typ != 'w' && typ != 'j'){
			System.out.println("Der Personentyp ist ungültig!");
			return -100.0;
		}

		double typwert = 0.0;
		if(typ == 'm'){
			typwert = 0.7;
		}

		if(typ == 'w'){
			typwert = 0.6;
		}

		if(typ == 'j'){
			typwert = 0.5;
		}

		return alkmasse / (gewicht * typwert);
	}

	public static void main(String[] args){
		double meineMasse = errechneMasse(1000, 0.12);
		System.out.println("Wein: " + meineMasse);

		double alkK = errechneAlkKonzentration(meineMasse, 80.0, 'm');
		System.out.println("Mann: " + alkK);

		if(alkK >= 0.5){
			System.out.println("Das Autofahren ist für Sie nicht mehr erlaubt!");
		}
		else if(alkK >= 0.3 && alkK < 0.5){
			System.out.println("Vom Autofahren wird Ihnen abgeraten!");
		}
	}
}
