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
		int[] count = new int[6];
		int i = 0;
		while(number >= 500) {
			count[i]++;
			number -= 500;
		}
		i++;
		while(number >= 100) {
			count[i]++;
			number -= 100;
		}
		i++;
		while(number >= 50) {
			count[i]++;
			number -= 50;
		}
		i++;
		while(number >= 10) {
			count[i]++;
			number -= 10;
		}
		i++;
		while(number >= 5) {
			count[i]++;
			number -= 5;
		}
		i++;
		while(number >= 1) {
			count[i]++;
			number -= 1;
		}
		String[] digit = {"D", "C", "L", "X", "V", "I"};
		String result = "";
		for(i = 0; i < count.length; i++) {
			int n = count[i];
			if(n == 4) {
				result += digit[i] + digit[i - 1];
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
