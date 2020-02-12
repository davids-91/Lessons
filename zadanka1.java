import java.util.Scanner;

public class zadanka1 {

	public static void main(String[] args) {
//		zad16(21);
		zad5();
	}

	private static void zad5() {
		float price;
		int instalmentsCount;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Cena towaru (100-10000) = ");
			price = scanner.nextFloat();
			System.out.print("Liczba rat (6-48) = ");
			instalmentsCount = scanner.nextInt();
		} while ((price < 100 || price > 10000) || (instalmentsCount < 6 || instalmentsCount > 48));
		
		float interestPercent, interestAmount;
		if (instalmentsCount >= 6 && instalmentsCount <= 12) {
			interestPercent = 0.025f;
		} else if (instalmentsCount >= 13 && instalmentsCount <= 24) {
			interestPercent = 0.05f;
		} else { //(instalmentsCount >= 25 && instalmentsCount <= 48)
			interestPercent = 0.10f;
		}
		interestAmount = price * interestPercent;
		float instalment = (price / instalmentsCount) + (interestAmount / instalmentsCount);
		System.out.println("Wysokość miesięcznej raty = " + instalment);
	}
	
	private static void zad16(int number) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println("Dzielnik liczby " + number + " to: " + i);
			}
		}
	}
}
