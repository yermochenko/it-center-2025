package by.vsu;

public class CommandNewEmptyLinkedListUser implements Command {
	@Override
	public boolean execute(Lists lists) {
		lists.setListUsers(new LinkedList<>());
		return false;
	}

	@Override
	public String name() {
		return "создать LinkedList<User> (пустой)";
	}
}
