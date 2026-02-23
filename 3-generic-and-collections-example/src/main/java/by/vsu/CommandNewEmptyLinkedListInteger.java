package by.vsu;

public class CommandNewEmptyLinkedListInteger implements Command {
	@Override
	public boolean execute(Lists lists) {
		lists.setListIntegers(new LinkedList<>());
		return false;
	}

	@Override
	public String name() {
		return "создать LinkedList<Integer> (пустой)";
	}
}
