package by.vsu;

public interface ActivityType {
	/**
	 * Вычисляет, сколько энергии было потрачено во время
	 * тренировки в зависимости от её длительности
	 * @param person тренирующийся человек
	 * @param duration длительность тренировки (в минутах)
	 * @return затраченную энергию (в калориях)
	 */
	double energy(Person person, double duration);
}
