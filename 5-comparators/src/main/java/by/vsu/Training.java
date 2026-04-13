package by.vsu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.StringJoiner;

public class Training {
	private final String name;
	private final ActivityType type;
	private final Date start;
	private final Date finish;

	private Training(String name, ActivityType type, Date start, Date finish) {
		this.name = name;
		this.type = type;
		this.start = start;
		this.finish = finish;
	}

	public String getName() {
		return name;
	}

	public ActivityType getType() {
		return type;
	}

	public Date getStart() {
		return start;
	}

	public Date getFinish() {
		return finish;
	}

	public double wasterEnergy(Person person) {
		return type.energy(person, Period.length(start, finish));
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return new StringJoiner(", ", Training.class.getSimpleName() + "[", "]")
				.add("name='" + name + "'")
				.add("start=" + sdf.format(start))
				.add("finish=" + sdf.format(finish))
				.toString();
	}

	@Override
	public boolean equals(Object object) {
		if (object == null || getClass() != object.getClass()) return false;
		Training training = (Training) object;
		boolean eq1 = Objects.equals(name, training.name);
		boolean eq2 = Objects.equals(start, training.start);
		boolean eq3 = Objects.equals(finish, training.finish);
		return eq1 && eq2 && eq3;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, start, finish);
	}

	public static Training.Builder builder() {
		return new Training.Builder();
	}

	public static class Builder {
		private String name;
		private ActivityType type;
		private Date start;
		private Date finish;

		private Builder() {}

		public Training.Builder name(String name) {
			this.name = name;
			return this;
		}

		public Training.Builder type(ActivityType type) {
			this.type = type;
			return this;
		}

		public Training.Builder start(int hour, int minute, int second) {
			this.start = buildTime(hour, minute, second);
			return this;
		}

		public Training.Builder finish(int hour, int minute, int second) {
			this.finish = buildTime(hour, minute, second);
			return this;
		}

		public Training build() {
			return new Training(name, type, start, finish);
		}

		private Date buildTime(int hour, int minute, int second) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(0);
			calendar.set(Calendar.HOUR_OF_DAY, hour);
			calendar.set(Calendar.MINUTE, minute);
			calendar.set(Calendar.SECOND, second);
			return calendar.getTime();
		}
	}
}
