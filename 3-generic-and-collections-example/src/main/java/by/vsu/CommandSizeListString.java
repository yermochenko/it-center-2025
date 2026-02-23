package by.vsu;

public class CommandSizeListString implements Command {
	@Override
	public boolean execute(Lists lists) {
		List<String> list = lists.getListStrings();
		if(list != null) {
			int size = list.size();
			if(size > 0) {
				System.out.printf("Размер списка строк: %d\n", size);
			} else {
				System.out.println("Список строк пуст");
			}
		} else {
			System.out.println("Список строк ещё не создан");
		}
		return false;
	}

	@Override
	public String name() {
		return "Размер списка строк";
	}
}
