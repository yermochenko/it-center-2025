package by.vsu;

import java.util.Scanner;

public class CommandNewArrayListInteger implements Command {
	@Override
	public boolean execute(Lists lists) {
		Scanner input = new Scanner(System.in);
		System.out.print("Введите размер списка целых чисел: ");
		int n = Integer.parseInt(input.nextLine());
		lists.setListIntegers(new ArrayList<>(n));
		return false;
	}

	@Override
	public String name() {
		return "создать ArrayList<Integer> (из N элементов)";
	}
}
