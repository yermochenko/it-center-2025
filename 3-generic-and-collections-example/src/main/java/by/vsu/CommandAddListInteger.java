package by.vsu;

import java.util.Scanner;

public class CommandAddListInteger implements Command {
	@Override
	public boolean execute(Lists lists) {
		List<Integer> list = lists.getListIntegers();
		if(list != null) {
			Scanner input = new Scanner(System.in);
			System.out.print("Введите число: ");
			int number = Integer.parseInt(input.nextLine());
			list.add(number);
		} else {
			System.out.println("Список целых чисел ещё не создан");
		}
		return false;
	}

	@Override
	public String name() {
		return "Добавление элемента в список целых чисел";
	}
}
