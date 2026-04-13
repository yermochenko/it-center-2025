package by.vsu;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
	public static final ActivityType C = new ActivityCardioType();
	public static final ActivityType P = new ActivityPowerType();

	@Test
	void getWastedEnergyTest1() {
		Person person = Person.builder().surname("Иванов").name("Иван").birthday(2001, 7, 9).weight(53.7).height(201.4)
			.trainings(List.of(
				Training.builder().name("Пробежка") .type(C).start( 6, 30, 0).finish( 7, 15, 0).build(),
				Training.builder().name("Аэробика") .type(C).start( 7, 30, 0).finish( 8,  0, 0).build(),
				Training.builder().name("Разминка") .type(C).start(16, 30, 0).finish(16, 40, 0).build(),
				Training.builder().name("Тренажёры").type(P).start(16, 40, 0).finish(17,  5, 0).build(),
				Training.builder().name("Разминка") .type(C).start(17,  5, 0).finish(17, 15, 0).build(),
				Training.builder().name("Тренажёры").type(P).start(17, 15, 0).finish(17, 35, 0).build(),
				Training.builder().name("Разминка") .type(C).start(17, 35, 0).finish(17, 45, 0).build(),
				Training.builder().name("Разминка") .type(C).start(21,  0, 0).finish(21, 15, 0).build(),
				Training.builder().name("Бокс")     .type(C).start(21, 15, 0).finish(22,  0, 0).build(),
				Training.builder().name("Плавание") .type(C).start(22,  0, 0).finish(23,  0, 0).build()
			))
			.build();
		assertEquals(1_389_871.81, person.getWastedEnergy(), 0.01);
	}

	@Test
	void getWastedEnergyTest2() {
		Person person = Person.builder().surname("Петров").name("Пётр").birthday(1998, 2, 17).weight(104) .height(175.6)
			.trainings(List.of(
				Training.builder().name("Разминка") .type(C).start( 5, 45, 0).finish( 6,  5, 0).build(),
				Training.builder().name("Плавание") .type(C).start( 6,  5, 0).finish( 7,  0, 0).build(),
				Training.builder().name("Разминка") .type(C).start(19,  0, 0).finish(19, 20, 0).build(),
				Training.builder().name("Тренажёры").type(P).start(19, 20, 0).finish(19, 40, 0).build(),
				Training.builder().name("Волейбол") .type(P).start(19, 40, 0).finish(21,  0, 0).build()
			))
			.build();
		assertEquals(941_989.67, person.getWastedEnergy(), 0.01);
	}

	@Test
	void getWastedEnergyTest3() {
		Person person = Person.builder().surname("Васильев").name("Василий").birthday(2004, 10, 29).weight(85.5).height(168)
			.trainings(List.of(
				Training.builder().name("Разминка") .type(C).start( 7,  0, 0).finish( 7, 15, 0).build(),
				Training.builder().name("Тренажёры").type(P).start( 7, 15, 0).finish( 7, 30, 0).build(),
				Training.builder().name("Разминка") .type(C).start( 7, 30, 0).finish( 7, 45, 0).build(),
				Training.builder().name("Разминка") .type(C).start(20,  0, 0).finish(20, 15, 0).build(),
				Training.builder().name("Тренажёры").type(P).start(20, 15, 0).finish(20, 45, 0).build(),
				Training.builder().name("Разминка") .type(C).start(20, 45, 0).finish(21,  0, 0).build()
			))
			.build();
		assertEquals(367_855.25, person.getWastedEnergy(), 0.01);
	}
}
