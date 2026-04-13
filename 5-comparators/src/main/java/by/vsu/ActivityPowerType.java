package by.vsu;

public class ActivityPowerType implements ActivityType {
	@Override
	public double energy(Person person, double duration) {
		return 26.475 * person.getWeight() * duration;
	}
}
