package by.vsu;

import java.util.Scanner;

public class Main {
	public static <E> void output(List<E> list) {
		System.out.printf("*** Список с количеством элементов %d ***\n", list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("****************");
	}

	public static <E extends Comparable<E>> E max(List<E> list) {
		if(list.size() == 0) {
			return null;
		}
		E currentMax = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			E currentElement = list.get(i);
			if(currentElement.compareTo(currentMax) > 0) {
				currentMax = currentElement;
			}
		}
		return currentMax;
	}

	public static void main(String[] args) {
		Lists lists = new Lists();
		List<Command> commands = new ArrayList<>();
		commands.add(new CommandNewEmptyArrayListString());
		commands.add(new CommandNewArrayListString());
		commands.add(new CommandNewEmptyArrayListInteger());
		commands.add(new CommandNewArrayListInteger());
		commands.add(new CommandNewEmptyArrayListUser());
		commands.add(new CommandNewArrayListUser());
		commands.add(new CommandNewEmptyLinkedListString());
		commands.add(new CommandNewLinkedListString());
		commands.add(new CommandNewEmptyLinkedListInteger());
		commands.add(new CommandNewLinkedListInteger());
		commands.add(new CommandNewEmptyLinkedListUser());
		commands.add(new CommandNewLinkedListUser());
		commands.add(new CommandOutputListString());
		commands.add(new CommandOutputListInteger());
		commands.add(new CommandOutputListUser());
		commands.add(new CommandAddListString());
		commands.add(new CommandAddListInteger());
		commands.add(new CommandAddListUser());
		commands.add(new CommandMaxListString());
		commands.add(new CommandMaxListInteger());
		commands.add(new CommandMaxListUser());
		commands.add(new CommandSizeListString());
		commands.add(new CommandSizeListInteger());
		commands.add(new CommandSizeListUser());
		commands.add(new CommandExit());

		Scanner input = new Scanner(System.in);
		boolean work = true;
		while(work) {
			System.out.println("МЕНЮ:");
			for(int i = 0; i < commands.size(); i++) {
				Command command = commands.get(i);
				System.out.printf("    %2d) %s\n", i + 1, command.name());
			}
			System.out.println();
			System.out.print("Введите номер выбранного пункта меню: ");
			int menuIndex = Integer.parseInt(input.nextLine());
			if(menuIndex > 0 && menuIndex <= commands.size()) {
				Command command = commands.get(menuIndex - 1);
				work = !command.execute(lists);
			} else {
				System.out.println("Неверный номер пункта меню");
			}
			System.out.println();
			System.out.println("Нажмите ВВОД для продолжения...");
			input.nextLine();
			System.out.println();
		}
	}
}
