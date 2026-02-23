package by.vsu;

public class CommandOutputListString implements Command {
	@Override
	public boolean execute(Lists lists) {
		List<String> list = lists.getListStrings();
		if(list != null) {
			Main.output(list);
		} else {
			System.out.println("Список строк ещё не создан");
		}
		return false;
	}

	@Override
	public String name() {
		return "Вывести список строк";
	}
}
