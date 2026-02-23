package by.vsu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CommandAddListUser implements Command {
	@Override
	public boolean execute(Lists lists) {
		List<User> list = lists.getListUsers();
		if(list != null) {
			Scanner input = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			try {
				System.out.print("Введите имя пользователя: ");
				String name = input.nextLine();
				System.out.printf("Введите дату рождения пользователя (в формате %s): ", sdf.toPattern());
				Date birthday = sdf.parse(input.nextLine());
				System.out.print("Введите адрес электронной почты: ");
				String email = input.nextLine();
				System.out.print("Введите пароль: ");
				String password = input.nextLine();
				list.add(User.newUser(name, birthday, email, password));
			} catch (ParseException e) {
				System.out.println("Ошибка. Дата не соответствует формату");
			}
		} else {
			System.out.println("Список пользователей ещё не создан");
		}
		return false;
	}

	@Override
	public String name() {
		return "Добавление элемента в список пользователей";
	}
}
