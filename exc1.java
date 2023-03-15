package curso_programacao;

public class exc1 {
	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		String sf1 = String.format("%s, which price is $ %.2f", product1, price1);
		String sf2 = String.format("%s, which price is $ %.2f", product2, price2);
		String sf3 = String.format("Record: %d years old, code %d and gender : %c", age, code, gender);
		String sf4 = String.format("Measue with eight decimal places: %.8f", measure);
		String sf5 = String.format("Rouded (three decimal places): %.3f", measure);
		String sf6 = String.format("US decimal point: %.3f", measure);

		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println("");
		System.out.println(sf3);
		System.out.println("");
		System.out.println(sf4);
		System.out.println(sf5);
		System.out.println(sf6);

	}

}
