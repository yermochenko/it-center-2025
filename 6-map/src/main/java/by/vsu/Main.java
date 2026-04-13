package by.vsu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	static void main() {
		List<Student> students = List.of(
			new Student("Иванов", 8),
			new Student("Петров", 7),
			new Student("Волкова", 5),
			new Student("Сидоров", 8),
			new Student("Орлова", 9),
			new Student("Васильев", 7),
			new Student("Александров", 8),
			new Student("Воробьёва", 6),
			new Student("Сергеев", 9),
			new Student("Львова", 8),
			new Student("Павлов", 7)
		);

		System.out.println("Вариант 1. Вычисление через массив");
		int[] gradeCounts = new int[10];
		for(Student student : students) {
			gradeCounts[student.grade() - 1]++;
		}
		for(int grade = 0; grade < gradeCounts.length; grade++) {
			int gradeCount = gradeCounts[grade];
			if(gradeCount != 0) {
				System.out.printf("Оценку %d получило студентов: %d\n", grade + 1, gradeCount);
				for(Student student : students) {
					if(student.grade() == grade + 1) {
						System.out.printf("    %s\n", student.name());
					}
				}
			}
		}

		System.out.println("Вариант 2. Вычисление через карту отображений");
		Map<Integer, List<Student>> grades = new HashMap<>();
		for(Student student : students) {
			List<Student> list = grades.computeIfAbsent(student.grade(), ArrayList::new);
			list.add(student);
		}
		for(var entry : grades.entrySet()) {
			var grade = entry.getKey();
			var list = entry.getValue();
			System.out.printf("Оценку %d получило студентов: %d\n", grade, list.size());
			for(Student student : list) {
				System.out.printf("    %s\n", student.name());
			}
		}
	}
}
