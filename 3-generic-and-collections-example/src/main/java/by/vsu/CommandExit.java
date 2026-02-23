package by.vsu;

public class CommandExit implements Command {
	@Override
	public boolean execute(Lists lists) {
		return true;
	}

	@Override
	public String name() {
		return "Выход";
	}
}
