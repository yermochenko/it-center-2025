package by.vsu;

public interface Command {
	/**
	 * Метод, который вызывается, когда пользователь выбирает
	 * команду из меню
	 * @param lists объект со списками, которые обрабатываются в программе
	 * @return true если нужно закончить работу программы, иначе false
	 */
	boolean execute(Lists lists);

	/**
	 * @return Название команды (как она отображается в меню)
	 */
	String name();
}
