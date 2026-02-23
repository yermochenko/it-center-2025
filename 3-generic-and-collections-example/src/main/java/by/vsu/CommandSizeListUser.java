package by.vsu;

public class CommandSizeListUser implements Command {
	@Override
	public boolean execute(Lists lists) {
		List<User> list = lists.getListUsers();
		if(list != null) {
			int size = list.size();
			if(size > 0) {
				System.out.printf("Размер списка пользователей: %d\n", size);
			} else {
				System.out.println("Список пользователей пуст");
			}
		} else {
			System.out.println("Список пользователей ещё не создан");
		}
		return false;
	}

	@Override
	public String name() {
		return "Размер списка пользователей";
	}
}
