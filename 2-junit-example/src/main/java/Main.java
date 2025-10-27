import java.util.Scanner;

public class Main {
	/**
	 * Форматирование числа в строку, записанную римскими цифрами I, V, X, L, C
	 * @param number целое число в диапазоне от 1 до 500
	 * @return строка, представляющая число, записанное римскими цифрами
	 * @throws RuntimeException если число не входит в диапазон от 1 до 500
	 */
	public static String toRoman(int number) {
		if(number < 1 || number > 500) throw new RuntimeException("Неправильное число. Число должно быть от 1 до 500");
		String result = "";
		while(number >= 500) {
			result += "D";
			number -= 500;
		}
		while(number >= 100) {
			result += "C";
			number -= 100;
		}
		while(number >= 50) {
			result += "L";
			number -= 50;
		}
		while(number >= 10) {
			result += "X";
			number -= 10;
		}
		while(number >= 5) {
			result += "V";
			number -= 5;
		}
		while(number >= 1) {
			result += "I";
			number -= 1;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите целое число от 1 до 100: ");
		int number = scanner.nextInt();
		System.out.println(toRoman(number));
	}
}
