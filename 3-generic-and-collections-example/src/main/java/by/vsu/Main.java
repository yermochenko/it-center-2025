package by.vsu;

import java.util.Scanner;

public class Main {
	public static void output(ArrayList lines) {
		System.out.printf("*** Список с количеством элементов %d ***\n", lines.size());
		for(int i = 0; i < lines.size(); i++) {
			System.out.println(lines.get(i));
		}
		System.out.println("****************");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество строк в списке");
		System.out.println("или 0, если список будет вводится до тех пор, пока не будет введена пустая строка.");
		System.out.print("Количество: ");
		int n = Integer.parseInt(sc.nextLine());
		ArrayList lines;
		if(n > 0) {
			lines = new ArrayList(n);
			for(int i = 0; i < n; i++) {
				System.out.printf("Введите элемент с индексом %d: ", i);
				String s = sc.nextLine();
				lines.set(i, s);
			}
		} else if(n == 0) {
			lines = new ArrayList();
			for(int i = 0;; i++) {
				System.out.printf("Введите элемент с индексом %d: ", i);
				String s = sc.nextLine();
				if(s.isEmpty()) {
					break;
				}
				lines.add(s);
			}
		} else {
			System.out.println("Количество строк не должно быть отрицательным числом");
			return;
		}
		output(lines);
	}
}
