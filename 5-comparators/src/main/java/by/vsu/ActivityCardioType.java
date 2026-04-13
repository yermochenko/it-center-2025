package by.vsu;

public class ActivityCardioType implements ActivityType {
	@Override
	public double energy(Person person, double duration) {
		double coefficient;
		if(duration <= 30) {
			coefficient = 20 * duration * duration / 9;
		} else if(duration <= 60) {
			coefficient = 2000 + (10 * duration * duration - 200 * duration - 3000) / 3;
		} else {
			coefficient = 3000;
		}
		return person.getWeight() * coefficient * duration / 60;
	}
}
