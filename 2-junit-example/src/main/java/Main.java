import java.util.Scanner;

public class Main {
	/**
	 * Форматирование числа в строку, записанную римскими цифрами I, V, X, L, C
	 * @param number целое число в диапазоне от 1 до 500
	 * @return строка, представляющая число, записанное римскими цифрами
	 * @throws RuntimeException если число не входит в диапазон от 1 до 500
	 */
	public static String toRoman(int number) {
		return null;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите целое число от 1 до 100: ");
		int number = scanner.nextInt();
		System.out.println(toRoman(number));
	}
}
