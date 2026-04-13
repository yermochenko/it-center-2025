package by.vsu;

import java.text.SimpleDateFormat;
import java.util.*;

public class Person {
	private final String name;
	private final String surname;
	private final Date birthday;
	private double weight;
	private double height;
	private List<Training> trainings;

	private Person(String name, String surname, Date birthday, double weight, double height, List<Training> trainings) {
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.weight = weight;
		this.height = height;
		this.trainings = trainings;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
		bmi = null;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		bmi = null;
	}

	public List<Training> getTrainings() {
		return trainings;
	}

	public void setTrainings(List<Training> trainings) {
		this.trainings = trainings;
	}

	private Double bmi;
	public double getBmi() {
		if(bmi == null) {
			bmi = calcBmi();
		}
		return bmi;
	}

	private double calcBmi() {
		return 10_000 * getWeight() / (getHeight() * getHeight());
	}

	public double getWastedEnergy() {
		// TODO: реализовать вычисляемое поле
		return 0;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
				.add("name='" + name + "'")
				.add("surname='" + surname + "'")
				.add("birthday=" + (birthday != null ? sdf.format(birthday) : "null"))
				.add("weight=" + weight)
				.add("height=" + height)
				.toString();
	}

	@Override
	public boolean equals(Object object) {
		if (object == null || getClass() != object.getClass()) return false;
		Person person = (Person) object;
		boolean eq1 = Double.compare(weight, person.weight) == 0;
		boolean eq2 = Double.compare(height, person.height) == 0;
		boolean eq3 = Objects.equals(name, person.name);
		boolean eq4 = Objects.equals(surname, person.surname);
		boolean eq5 = Objects.equals(birthday, person.birthday);
		return eq1 && eq2 && eq3 && eq4 && eq5;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, surname, birthday, weight, height);
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private String name;
		private String surname;
		private Date birthday;
		private double weight;
		private double height;
		private List<Training> trainings;

		private Builder() {}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder surname(String surname) {
			this.surname = surname;
			return this;
		}

		public Builder birthday(int year, int month, int day) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(0);
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, month - 1);
			calendar.set(Calendar.DAY_OF_MONTH, day);
			this.birthday = calendar.getTime();
			return this;
		}

		public Builder weight(double weight) {
			this.weight = weight;
			return this;
		}

		public Builder height(double height) {
			this.height = height;
			return this;
		}

		public Builder trainings(List<Training> trainings) {
			this.trainings = trainings;
			return this;
		}

		Person build() {
			return new Person(name, surname, birthday, weight, height, trainings);
		}
	}
}
