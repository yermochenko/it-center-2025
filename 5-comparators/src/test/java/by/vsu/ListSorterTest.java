package by.vsu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListSorterTest {
	@Test
	void sort1() {
		List<Integer> actual = new ArrayList<>(List.of(4, 8, 5, 12, 8, 13, 11, 15, 4, 9));
		ListSorter.sort(actual, Integer::compare);
		List<Integer> expected = new ArrayList<>(List.of(4, 4, 5, 8, 8, 9, 11, 12, 13, 15));
		assertEquals(expected, actual);
	}

	@Test
	void sort2() {
		List<String> actual = new ArrayList<>(List.of(
			"понедельник",
			"вторник",
			"среда",
			"четверг",
			"пятница",
			"суббота",
			"воскресенье"
		));
		ListSorter.sort(actual, Comparator.comparingInt(String::length).thenComparing(String::compareToIgnoreCase));
		List<String> expected = new ArrayList<>(List.of(
			"среда",
			"вторник",
			"пятница",
			"суббота",
			"четверг",
			"воскресенье",
			"понедельник"
		));
		assertEquals(expected, actual);
	}

	@Test
	void sort3() {
		List<String> actual = new ArrayList<>(List.of(
			"понедельник",
			"вторник",
			"среда",
			"четверг",
			"пятница",
			"суббота",
			"воскресенье"
		));
		ListSorter.sort(actual, String::compareToIgnoreCase);
		List<String> expected = new ArrayList<>(List.of(
			"воскресенье",
			"вторник",
			"понедельник",
			"пятница",
			"среда",
			"суббота",
			"четверг"
		));
		assertEquals(expected, actual);
	}

	@Test
	void sort4() {
		List<Person> actual = new ArrayList<>(List.of(
			Person.builder().surname("Иванов")   .name("Иван")   .birthday(2001,  7,  9).weight(53.7).height(201.4).build(),
			Person.builder().surname("Зеленцова").name("Любовь") .birthday(2001,  4, 30).weight(47.3).height(187.5).build(),
			Person.builder().surname("Петров")   .name("Василий").birthday(1998,  2, 17).weight(104) .height(175.6).build(),
			Person.builder().surname("Краско")   .name("Надежда").birthday(2002,  8, 14).weight(74.6).height(164.3).build(),
			Person.builder().surname("Синявская").name("Вера")   .birthday(2004, 10,  2).weight(92.2).height(158.2).build(),
			Person.builder().surname("Васильев") .name("Борис")  .birthday(2004, 10, 29).weight(85.5).height(168)  .build(),
			Person.builder().surname("Борисов")  .name("Василий").birthday(2005,  1, 24).weight(81.8).height(195.2).build()
		));
		ListSorter.sort(actual, Comparator.comparing(Person::getSurname)); // sort by surname
		List<Person> expected = new ArrayList<>(List.of(
			Person.builder().surname("Борисов")  .name("Василий").birthday(2005,  1, 24).weight(81.8).height(195.2).build(),
			Person.builder().surname("Васильев") .name("Борис")  .birthday(2004, 10, 29).weight(85.5).height(168)  .build(),
			Person.builder().surname("Зеленцова").name("Любовь") .birthday(2001,  4, 30).weight(47.3).height(187.5).build(),
			Person.builder().surname("Иванов")   .name("Иван")   .birthday(2001,  7,  9).weight(53.7).height(201.4).build(),
			Person.builder().surname("Краско")   .name("Надежда").birthday(2002,  8, 14).weight(74.6).height(164.3).build(),
			Person.builder().surname("Петров")   .name("Василий").birthday(1998,  2, 17).weight(104) .height(175.6).build(),
			Person.builder().surname("Синявская").name("Вера")   .birthday(2004, 10,  2).weight(92.2).height(158.2).build()
		));
		assertEquals(expected, actual);
	}

	@Test
	void sort5() {
		List<Person> actual = new ArrayList<>(List.of(
			Person.builder().surname("Иванов")   .name("Иван")   .birthday(2001,  7,  9).weight(53.7).height(201.4).build(),
			Person.builder().surname("Зеленцова").name("Любовь") .birthday(2001,  4, 30).weight(47.3).height(187.5).build(),
			Person.builder().surname("Петров")   .name("Василий").birthday(1998,  2, 17).weight(104) .height(175.6).build(),
			Person.builder().surname("Краско")   .name("Надежда").birthday(2002,  8, 14).weight(74.6).height(164.3).build(),
			Person.builder().surname("Синявская").name("Вера")   .birthday(2004, 10,  2).weight(92.2).height(158.2).build(),
			Person.builder().surname("Васильев") .name("Борис")  .birthday(2004, 10, 29).weight(85.5).height(168)  .build(),
			Person.builder().surname("Борисов")  .name("Василий").birthday(2005,  1, 24).weight(81.8).height(195.2).build()
		));
		ListSorter.sort(actual, Comparator.comparing(Person::getName).thenComparing(Person::getSurname)); // sort by name, and then by surname
		List<Person> expected = new ArrayList<>(List.of(
			Person.builder().name("Борис")  .surname("Васильев") .birthday(2004, 10, 29).weight(85.5).height(168)  .build(),
			Person.builder().name("Василий").surname("Борисов")  .birthday(2005,  1, 24).weight(81.8).height(195.2).build(),
			Person.builder().name("Василий").surname("Петров")   .birthday(1998,  2, 17).weight(104) .height(175.6).build(),
			Person.builder().name("Вера")   .surname("Синявская").birthday(2004, 10,  2).weight(92.2).height(158.2).build(),
			Person.builder().name("Иван")   .surname("Иванов")   .birthday(2001,  7,  9).weight(53.7).height(201.4).build(),
			Person.builder().name("Любовь") .surname("Зеленцова").birthday(2001,  4, 30).weight(47.3).height(187.5).build(),
			Person.builder().name("Надежда").surname("Краско")   .birthday(2002,  8, 14).weight(74.6).height(164.3).build()
		));
		assertEquals(expected, actual);
	}

	@Test
	void sort6() {
		List<Person> actual = new ArrayList<>(List.of(
			Person.builder().surname("Иванов")   .name("Иван")   .birthday(2001,  7,  9).weight(53.7).height(201.4).build(),
			Person.builder().surname("Зеленцова").name("Любовь") .birthday(2001,  4, 30).weight(47.3).height(187.5).build(),
			Person.builder().surname("Петров")   .name("Василий").birthday(1998,  2, 17).weight(104) .height(175.6).build(),
			Person.builder().surname("Краско")   .name("Надежда").birthday(2002,  8, 14).weight(74.6).height(164.3).build(),
			Person.builder().surname("Синявская").name("Вера")   .birthday(2004, 10,  2).weight(92.2).height(158.2).build(),
			Person.builder().surname("Васильев") .name("Борис")  .birthday(2004, 10, 29).weight(85.5).height(168)  .build(),
			Person.builder().surname("Борисов")  .name("Василий").birthday(2005,  1, 24).weight(81.8).height(195.2).build()
		));
		ListSorter.sort(actual, Comparator.comparing(Person::getBirthday)); // sort by birthday
		List<Person> expected = new ArrayList<>(List.of(
			Person.builder().surname("Петров")   .name("Василий").birthday(1998,  2, 17).weight(104) .height(175.6).build(),
			Person.builder().surname("Зеленцова").name("Любовь") .birthday(2001,  4, 30).weight(47.3).height(187.5).build(),
			Person.builder().surname("Иванов")   .name("Иван")   .birthday(2001,  7,  9).weight(53.7).height(201.4).build(),
			Person.builder().surname("Краско")   .name("Надежда").birthday(2002,  8, 14).weight(74.6).height(164.3).build(),
			Person.builder().surname("Синявская").name("Вера")   .birthday(2004, 10,  2).weight(92.2).height(158.2).build(),
			Person.builder().surname("Васильев") .name("Борис")  .birthday(2004, 10, 29).weight(85.5).height(168)  .build(),
			Person.builder().surname("Борисов")  .name("Василий").birthday(2005,  1, 24).weight(81.8).height(195.2).build()
		));
		assertEquals(expected, actual);
	}

	@Test
	void sort7() {
		List<Person> actual = new ArrayList<>(List.of(
			Person.builder().surname("Иванов")   .name("Иван")   .birthday(2001,  7,  9).weight(53.7).height(201.4).build(),
			Person.builder().surname("Зеленцова").name("Любовь") .birthday(2001,  4, 30).weight(47.3).height(187.5).build(),
			Person.builder().surname("Петров")   .name("Василий").birthday(1998,  2, 17).weight(104) .height(175.6).build(),
			Person.builder().surname("Краско")   .name("Надежда").birthday(2002,  8, 14).weight(74.6).height(164.3).build(),
			Person.builder().surname("Синявская").name("Вера")   .birthday(2004, 10,  2).weight(92.2).height(158.2).build(),
			Person.builder().surname("Васильев") .name("Борис")  .birthday(2004, 10, 29).weight(85.5).height(168)  .build(),
			Person.builder().surname("Борисов")  .name("Василий").birthday(2005,  1, 24).weight(81.8).height(195.2).build()
		));
		ListSorter.sort(actual, Comparator.comparingDouble(Person::getWeight)); // sort by weight
		List<Person> expected = new ArrayList<>(List.of(
			Person.builder().surname("Зеленцова").name("Любовь") .birthday(2001,  4, 30).weight(47.3).height(187.5).build(),
			Person.builder().surname("Иванов")   .name("Иван")   .birthday(2001,  7,  9).weight(53.7).height(201.4).build(),
			Person.builder().surname("Краско")   .name("Надежда").birthday(2002,  8, 14).weight(74.6).height(164.3).build(),
			Person.builder().surname("Борисов")  .name("Василий").birthday(2005,  1, 24).weight(81.8).height(195.2).build(),
			Person.builder().surname("Васильев") .name("Борис")  .birthday(2004, 10, 29).weight(85.5).height(168)  .build(),
			Person.builder().surname("Синявская").name("Вера")   .birthday(2004, 10,  2).weight(92.2).height(158.2).build(),
			Person.builder().surname("Петров")   .name("Василий").birthday(1998,  2, 17).weight(104) .height(175.6).build()
		));
		assertEquals(expected, actual);
	}

	@Test
	void sort8() {
		List<Person> actual = new ArrayList<>(List.of(
			Person.builder().surname("Иванов")   .name("Иван")   .birthday(2001,  7,  9).weight(53.7).height(201.4).build(),
			Person.builder().surname("Зеленцова").name("Любовь") .birthday(2001,  4, 30).weight(47.3).height(187.5).build(),
			Person.builder().surname("Петров")   .name("Василий").birthday(1998,  2, 17).weight(104) .height(175.6).build(),
			Person.builder().surname("Краско")   .name("Надежда").birthday(2002,  8, 14).weight(74.6).height(164.3).build(),
			Person.builder().surname("Синявская").name("Вера")   .birthday(2004, 10,  2).weight(92.2).height(158.2).build(),
			Person.builder().surname("Васильев") .name("Борис")  .birthday(2004, 10, 29).weight(85.5).height(168)  .build(),
			Person.builder().surname("Борисов")  .name("Василий").birthday(2005,  1, 24).weight(81.8).height(195.2).build()
		));
		ListSorter.sort(actual, Comparator.comparingDouble(Person::getHeight)); // sort by height
		List<Person> expected = new ArrayList<>(List.of(
			Person.builder().surname("Синявская").name("Вера")   .birthday(2004, 10,  2).weight(92.2).height(158.2).build(),
			Person.builder().surname("Краско")   .name("Надежда").birthday(2002,  8, 14).weight(74.6).height(164.3).build(),
			Person.builder().surname("Васильев") .name("Борис")  .birthday(2004, 10, 29).weight(85.5).height(168)  .build(),
			Person.builder().surname("Петров")   .name("Василий").birthday(1998,  2, 17).weight(104) .height(175.6).build(),
			Person.builder().surname("Зеленцова").name("Любовь") .birthday(2001,  4, 30).weight(47.3).height(187.5).build(),
			Person.builder().surname("Борисов")  .name("Василий").birthday(2005,  1, 24).weight(81.8).height(195.2).build(),
			Person.builder().surname("Иванов")   .name("Иван")   .birthday(2001,  7,  9).weight(53.7).height(201.4).build()
		));
		assertEquals(expected, actual);
	}

	@Test
	void sort9() {
		List<Person> actual = new ArrayList<>(List.of(
			Person.builder().surname("Иванов")   .name("Иван")   .birthday(2001,  7,  9).weight(53.7).height(201.4).build(),
			Person.builder().surname("Зеленцова").name("Любовь") .birthday(2001,  4, 30).weight(47.3).height(187.5).build(),
			Person.builder().surname("Петров")   .name("Василий").birthday(1998,  2, 17).weight(104) .height(175.6).build(),
			Person.builder().surname("Краско")   .name("Надежда").birthday(2002,  8, 14).weight(74.6).height(164.3).build(),
			Person.builder().surname("Синявская").name("Вера")   .birthday(2004, 10,  2).weight(92.2).height(158.2).build(),
			Person.builder().surname("Васильев") .name("Борис")  .birthday(2004, 10, 29).weight(85.5).height(168)  .build(),
			Person.builder().surname("Борисов")  .name("Василий").birthday(2005,  1, 24).weight(81.8).height(195.2).build()
		));
		ListSorter.sort(actual, Comparator.comparingDouble(Person::getBmi)); // sort by BMI (body mass index, kg/m^2)
		List<Person> expected = new ArrayList<>(List.of(
				Person.builder().surname("Иванов")   .name("Иван")   .birthday(2001,  7,  9).weight(53.7).height(201.4).build(),
				Person.builder().surname("Зеленцова").name("Любовь") .birthday(2001,  4, 30).weight(47.3).height(187.5).build(),
				Person.builder().surname("Борисов")  .name("Василий").birthday(2005,  1, 24).weight(81.8).height(195.2).build(),
				Person.builder().surname("Краско")   .name("Надежда").birthday(2002,  8, 14).weight(74.6).height(164.3).build(),
				Person.builder().surname("Васильев") .name("Борис")  .birthday(2004, 10, 29).weight(85.5).height(168)  .build(),
				Person.builder().surname("Петров")   .name("Василий").birthday(1998,  2, 17).weight(104) .height(175.6).build(),
				Person.builder().surname("Синявская").name("Вера")   .birthday(2004, 10,  2).weight(92.2).height(158.2).build()
		));
		assertEquals(expected, actual);
	}
}
