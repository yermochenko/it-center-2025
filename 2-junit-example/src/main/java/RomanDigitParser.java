import java.util.Scanner;

public class RomanDigitParser {
	/**
	 * Преобразование строки с записью числа римскими цифрами I, V, X, L, C, D
	 * в соответствующее целое число
	 * @param roman строки с записью числа римскими цифрами
	 * @return целое число - результат преобразования строки
	 * @throws NumberFormatException если строка содержит какие-либо символы
	 *                               помимо римских цифр
	 */
	public static int parse(String roman) {
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число римскими цифрами (D, C, L, X, V, I): ");
		String number = scanner.nextLine();
		System.out.println(parse(number));
	}
}
