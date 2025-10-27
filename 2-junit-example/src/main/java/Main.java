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
		int[] value = {500, 100, 50, 10, 5, 1};
		int[] count = new int[value.length];
		for(int i = 0; i < value.length; i++) {
			while(number >= value[i]) {
				count[i]++;
				number -= value[i];
			}
		}
		String[] digit = {"D", "C", "L", "X", "V", "I"};
		String result = "";
		for(int i = 0; i < count.length; i++) {
			int n = count[i];
			if(n == 4) {
				if(count[i - 1] == 0) {
					result += digit[i] + digit[i - 1];
				} else {
					result = result.substring(0, result.length() - 1) + digit[i] + digit[i - 2];
				}
			} else {
				result += digit[i].repeat(count[i]);
			}
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
