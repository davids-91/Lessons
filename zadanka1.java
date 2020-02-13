import java.util.Scanner;

public class zadanka1 {

	public static void main(String[] args) {
//		zad5();
//		zad6();
//		zad7();
//		zad8();
		zad9();
//		zad16(21);
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
	
	private static void zad6() {
		System.out.println("Witaj w programie Kalkulator");
		Scanner sc = new Scanner(System.in);
		System.out.print("Pierwsza liczba a = ");
		float a = sc.nextFloat();
		System.out.print("Symbol operacji matematycznej: ");
		char operation = sc.next().charAt(0);
		float b;
		do {
			System.out.print("Druga liczba b = ");
			b = sc.nextFloat();
		} while (operation == '/' && b == 0f);
		switch (operation) {
			case '+':
				System.out.print("a + b = " + (a + b));
				break;
			case '-':
				System.out.print("a - b = " + (a - b));
				break;
			case '*':
				System.out.print("a * b = " + (a * b));
				break;
			case '/':
				System.out.print("a / b = " + (a / b));
				break;
			default:
				System.out.print("Błędny znak działania. Koniec programu.");
		}
		sc.nextLine();
	}
	
	private static void zad7() {
		Scanner sc = new Scanner(System.in);
		int a;
		do {
			System.out.print("Podaj liczbę a = ");
			a = sc.nextInt();
		} while (a < 1);
		
		for (int i = 1; i <= a; i++) {
			if (i % 2 != 0) {
				System.out.println("Liczba nieparzysta = " + i);
			}
		}
	}
	
	private static void zad8() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		do {
			System.out.print("Podaj liczbę a = ");
			a = sc.nextInt();
			System.out.print("Podaj liczbę b = ");
			b = sc.nextInt();
		} while (a > b);
		
		int c = 0, i = a;
		while (i <= b) {
			c = c + i; //c += a;
			i++;
		}
		System.out.print(c + " ");
		
		c = 0; i = a;
		do {
			c += i;
			i++;
		} while (i <= b);
		System.out.print(c + " ");
		
		c = 0;
		for (i = a; i <= b; i++) {
			c += i;
		}
		System.out.print(c + " ");
	}
	
	private static void zad9() {
		Scanner sc = new Scanner(System.in);
		int n, i = 1;
		do {
			System.out.print("Podaj liczbę n = ");
			n = sc.nextInt();
		} while (n < 1);
		
		do {
			System.out.print(i + " ");
			i = i * 2;
		} while (i <= n);
	}
	
	private static void zad16(int number) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println("Dzielnik liczby " + number + " to: " + i);
			}
		}
	}
}
