package provaprog2;

import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String palavra = scanner.nextLine();
			String resultadoPalavra = "";

			for (int i = palavra.length() - 1; i >= 0; i--) {

				resultadoPalavra += palavra.charAt(i);
			}

			if (resultadoPalavra.equals(palavra)) {
				System.out.print("true");
			} else {
				System.out.print("false");
			}
		}

	}

}
