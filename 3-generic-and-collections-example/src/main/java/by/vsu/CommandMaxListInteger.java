package by.vsu;

public class CommandMaxListInteger implements Command {
	@Override
	public boolean execute(Lists lists) {
		List<Integer> list = lists.getListIntegers();
		if(list != null) {
			Integer max = Main.max(list);
			System.out.printf("Максимальное число: %d\n", max);
		} else {
			System.out.println("Список целых чисел ещё не создан");
		}
		return false;
	}

	@Override
	public String name() {
		return "Найти максимум в списке целых чисел";
	}
}
