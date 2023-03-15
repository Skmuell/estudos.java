package provaprog2;

import java.util.Scanner;

public class questao1 {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int ano = scanner.nextInt();
			int seculo = ano / 100 + 1;
			System.out.println(seculo);
		}

	}

}
