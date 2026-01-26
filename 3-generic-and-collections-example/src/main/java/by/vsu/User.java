package by.vsu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class User implements Comparable<User> {
	private String name;
	private Date birthday;
	private String email;
	private String password;

	private User() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static User newUser(String name, int year, int month, int day, String email, String password) {
		User user = new User();
		user.setName(name);
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day);
		user.setBirthday(calendar.getTime());
		user.setEmail(email);
		user.setPassword(password);
		return user;
	}

	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		return "User{" + "name='" + getName() + '\'' + ", birthday=" + format.format(getBirthday()) + ", email='" + getEmail() + '\'' + ", password='" + getPassword() + '\'' + '}';
	}

	@Override
	public int compareTo(User user) {
		int result = birthday.compareTo(user.getBirthday());
		if(result == 0) {
			result = name.compareTo(user.getName());
		}
		return result;
	}
}
