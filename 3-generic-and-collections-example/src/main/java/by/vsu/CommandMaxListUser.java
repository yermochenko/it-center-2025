package by.vsu;

public class CommandMaxListUser implements Command {
	@Override
	public boolean execute(Lists lists) {
		List<User> list = lists.getListUsers();
		if(list != null) {
			User max = Main.max(list);
			System.out.printf("Максимальный пользователь: %s\n", max);
		} else {
			System.out.println("Список пользователей ещё не создан");
		}
		return false;
	}

	@Override
	public String name() {
		return "Найти максимум в списке пользователей";
	}
}
