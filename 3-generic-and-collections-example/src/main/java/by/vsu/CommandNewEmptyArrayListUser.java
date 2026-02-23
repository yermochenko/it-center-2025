package by.vsu;

public class CommandNewEmptyArrayListUser implements Command {
	@Override
	public boolean execute(Lists lists) {
		lists.setListUsers(new ArrayList<>());
		return false;
	}

	@Override
	public String name() {
		return "создать ArrayList<User> (пустой)";
	}
}
