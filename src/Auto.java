
public class Auto {
	private double spotreba;
	private double velikostNadrze;
	private double palivo;

	/**
	 * konstruktor pro vytvoreni auta
	 * 
	 * @param spotreba       spotreba na 100 km
	 * @param velikostNadrze velikost nadrze
	 * @param palivo         aktuaùni mnozstvi
	 */
	public Auto(double spotreba, double velikostNadrze, double palivo) {
		super();

		this.spotreba = spotreba;
		this.velikostNadrze = velikostNadrze;
		this.palivo = palivo;
	}

	public void doplnPalivo(double novepalivo) {
		if (palivo + novepalivo <= velikostNadrze) {

			palivo += novepalivo;

		} else {

			palivo = velikostNadrze;
		}
	}

	public boolean jizda(double vzdalenost) {

		double spotrebakilometr = spotreba / 100;

		double potrebnePalivo = vzdalenost * spotrebakilometr;

		if (potrebnePalivo <= palivo) {
			palivo -= potrebnePalivo;

			return false;
		}

		return false;

	}

	public double dojezd() {
		double spotrebakilometr = spotreba / 100;

		double vzdalenost = palivo / spotrebakilometr;

		return vzdalenost;
	}

	@Override
	public String toString() {
		return "Auto [spotreba=" + spotreba + ", velikostNadrze=" + velikostNadrze + ", palivo=" + palivo + "]";
	}

}
