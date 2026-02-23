package by.vsu;

public class CommandOutputListUser implements Command {
	@Override
	public boolean execute(Lists lists) {
		List<User> list = lists.getListUsers();
		if(list != null) {
			Main.output(list);
		} else {
			System.out.println("Список пользователей ещё не создан");
		}
		return false;
	}

	@Override
	public String name() {
		return "Вывести список пользователей";
	}
}
