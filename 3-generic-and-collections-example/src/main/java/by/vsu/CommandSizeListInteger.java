package by.vsu;

public class CommandSizeListInteger implements Command {
	@Override
	public boolean execute(Lists lists) {
		List<Integer> list = lists.getListIntegers();
		if(list != null) {
			int size = list.size();
			if(size > 0) {
				System.out.printf("Размер списка целых чисел: %d\n", size);
			} else {
				System.out.println("Список целых чисел пуст");
			}
		} else {
			System.out.println("Список целых чисел ещё не создан");
		}
		return false;
	}

	@Override
	public String name() {
		return "Размер списка целых чисел";
	}
}
