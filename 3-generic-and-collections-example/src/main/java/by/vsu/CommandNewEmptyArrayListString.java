package by.vsu;

public class CommandNewEmptyArrayListString implements Command {
	@Override
	public boolean execute(Lists lists) {
		lists.setListStrings(new ArrayList<>());
		return false;
	}

	@Override
	public String name() {
		return "создать ArrayList<String> (пустой)";
	}
}
