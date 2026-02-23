package by.vsu;

public class CommandNewEmptyLinkedListString implements Command {
	@Override
	public boolean execute(Lists lists) {
		lists.setListStrings(new LinkedList<>());
		return false;
	}

	@Override
	public String name() {
		return "создать LinkedList<String> (пустой)";
	}
}
