package by.vsu;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
	public static <T> void sort(List<T> list, Comparator<T> comparator) {
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = i + 1; j < list.size(); j++) {
				T a = list.get(i);
				T b = list.get(j);
				if(comparator.compare(a, b) > 0) {
					list.set(i, b);
					list.set(j, a);
				}
			}
		}
	}
}
