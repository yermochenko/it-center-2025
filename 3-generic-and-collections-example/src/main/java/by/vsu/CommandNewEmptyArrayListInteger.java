package by.vsu;

public class CommandNewEmptyArrayListInteger implements Command {
	@Override
	public boolean execute(Lists lists) {
		lists.setListIntegers(new ArrayList<>());
		return false;
	}

	@Override
	public String name() {
		return "создать ArrayList<Integer> (пустой)";
	}
}
