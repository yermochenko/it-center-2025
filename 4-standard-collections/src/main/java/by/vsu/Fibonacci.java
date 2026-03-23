package by.vsu;

import java.util.Iterator;

public class Fibonacci implements Iterator<Long>, Iterable<Long> {
	private int n;
	private long a = 0;
	private long b = 1;

	public Fibonacci(int n) {
		this.n = n;
	}

	@Override
	public boolean hasNext() {
		return n > 0;
	}

	@Override
	public Long next() {
		n--;
		long c = a + b;
		b = a;
		a = c;
		return c;
	}

	@Override
	public Iterator<Long> iterator() {
		return this;
	}
}
