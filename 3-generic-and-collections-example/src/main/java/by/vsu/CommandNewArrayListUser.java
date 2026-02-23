package by.vsu;

import java.util.Scanner;

public class CommandNewArrayListUser implements Command {
	@Override
	public boolean execute(Lists lists) {
		Scanner input = new Scanner(System.in);
		System.out.print("Введите размер списка пользователей: ");
		int n = Integer.parseInt(input.nextLine());
		lists.setListUsers(new ArrayList<>(n));
		return false;
	}

	@Override
	public String name() {
		return "создать ArrayList<User> (из N элементов)";
	}
}
