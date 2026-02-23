package by.vsu;

import java.util.Scanner;

public class CommandNewLinkedListUser implements Command {
	@Override
	public boolean execute(Lists lists) {
		Scanner input = new Scanner(System.in);
		System.out.print("Введите размер списка пользователей: ");
		int n = Integer.parseInt(input.nextLine());
		lists.setListUsers(new LinkedList<>(n));
		return false;
	}

	@Override
	public String name() {
		return "создать LinkedList<User> (из N элементов)";
	}
}
