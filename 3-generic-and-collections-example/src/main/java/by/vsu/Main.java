package by.vsu;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3));
		list.add(4, 9);
		System.out.println(list);
	}
}
