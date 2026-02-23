package by.vsu;

public class CommandOutputListInteger implements Command {
	@Override
	public boolean execute(Lists lists) {
		List<Integer> list = lists.getListIntegers();
		if(list != null) {
			Main.output(list);
		} else {
			System.out.println("Список целых чисел ещё не создан");
		}
		return false;
	}

	@Override
	public String name() {
		return "Вывести список целых чисел";
	}
}
