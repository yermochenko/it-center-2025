package by.vsu;

public class Main {
	public static void output(Iterable<?> iterable) {
		for (Object element : iterable) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		output(new Fibonacci(10));
	}
}
