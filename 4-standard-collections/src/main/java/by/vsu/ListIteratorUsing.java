package by.vsu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorUsing {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(1, 2, 4, 3, 6, 5, 7, 8, 9, 11, 13, 15, 10, 17));
		System.out.println(list);
		list.add(12);
		list.addAll(List.of(14, 16, 18, 19, 20));
		System.out.println(list);

		// удаление нечётных элементов с помощью обращения к элементам по индексам
		/*
		for(int i = 0; i < list.size();) {
			if(list.get(i) % 2 == 1) {
				list.remove(i);
			} else {
				i++;
			}
		}
		//*/

		// удаление нечётных элементов с помощью итератора
		//*
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Integer n = iterator.next();
			if(n % 2 == 1) {
				iterator.remove();
			}
		}
		//*/

		System.out.println(list);
	}
}
