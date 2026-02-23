package by.vsu;

import java.util.Scanner;

public class CommandNewLinkedListString implements Command {
	@Override
	public boolean execute(Lists lists) {
		Scanner input = new Scanner(System.in);
		System.out.print("Введите размер списка строк: ");
		int n = Integer.parseInt(input.nextLine());
		lists.setListStrings(new LinkedList<>(n));
		return false;
	}

	@Override
	public String name() {
		return "создать LinkedList<String> (из N элементов)";
	}
}
