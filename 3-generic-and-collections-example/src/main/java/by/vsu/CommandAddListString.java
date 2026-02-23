package by.vsu;

import java.util.Scanner;

public class CommandAddListString implements Command {
	@Override
	public boolean execute(Lists lists) {
		List<String> list = lists.getListStrings();
		if(list != null) {
			Scanner input = new Scanner(System.in);
			System.out.print("Введите строку: ");
			String s = input.nextLine();
			list.add(s);
		} else {
			System.out.println("Список строк ещё не создан");
		}
		return false;
	}

	@Override
	public String name() {
		return "Добавление элемента в список строк";
	}
}
