package by.vsu;

public class CommandMaxListString implements Command {
	@Override
	public boolean execute(Lists lists) {
		List<String> list = lists.getListStrings();
		if(list != null) {
			String max = Main.max(list);
			System.out.printf("Максимальная строка: %s\n", max);
		} else {
			System.out.println("Список строк ещё не создан");
		}
		return false;
	}

	@Override
	public String name() {
		return "Найти максимум в списке строк";
	}
}
