package by.vsu;

import java.util.Calendar;

public class Main {
	public static <E> void output(ArrayList<E> list) {
		System.out.printf("*** Список с количеством элементов %d ***\n", list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("****************");
	}

	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		if(list.size() == 0) {
			return null;
		}
		E currentMax = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			E currentElement = list.get(i);
			if(currentElement.compareTo(currentMax) > 0) {
				currentMax = currentElement;
			}
		}
		return currentMax;
	}

	public static void main(String[] args) {
		ArrayList<String> listStr = new ArrayList<>();
		listStr.add("Monday");
		listStr.add("Tuesday");
		listStr.add("Wednesday");
		listStr.add("Thursday");
		listStr.add("Friday");
		listStr.add("Saturday");
		listStr.add("Sunday");
		output(listStr);
		String maxStr = max(listStr);
		System.out.println("max is " + maxStr);

		ArrayList<Integer> listInt = new ArrayList<>();
		listInt.add(345);
		listInt.add(123);
		listInt.add(678);
		listInt.add(987);
		listInt.add(426);
		output(listInt);
		Integer maxInt = max(listInt);
		System.out.println("max is " + maxInt);

		ArrayList<User> listUsers = new ArrayList<>();
		listUsers.add(User.newUser("Иван", 2003, Calendar.OCTOBER, 23, "ivan@vsu.by", "abc"));
		listUsers.add(User.newUser("Пётр", 1998, Calendar.MAY, 12, "petr@vsеu.by", "12345"));
		listUsers.add(User.newUser("Василий", 2003, Calendar.OCTOBER, 23, "vasya@mail.ru", "basil"));
		listUsers.add(User.newUser("Иннокентий", 1998, Calendar.FEBRUARY, 21, "kesha@gmail.com", "КЕША"));
		listUsers.add(User.newUser("Вера", 1998, Calendar.MAY, 8, "vera@yandex.ru", "54321"));
		output(listUsers);
		User maxUser = max(listUsers);
		System.out.println("max is " + maxUser);
	}
}
