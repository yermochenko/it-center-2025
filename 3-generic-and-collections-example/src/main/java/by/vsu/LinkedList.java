package by.vsu;

public class LinkedList<T> implements List<T> {
	private Node<T> begin;
	private Node<T> end;

	public LinkedList() {}

	public LinkedList(int size) {
		for(int i = 0; i < size; i++) {
			add(null);
		}
	}

	@Override
	public int size() {
		Node<T> curr = begin;
		int n = 0;
		while(curr != null) {
			n++;
			curr = curr.next;
		}
		return n;
	}

	@Override
	public T get(int i) {
		if(i < 0) {
			throw new ArrayIndexOutOfBoundsException(String.format("Index %d out of bounds", i));
		}
		Node<T> curr = begin;
		int j = 0;
		while(curr != null && j < i) {
			j++;
			curr = curr.next;
		}
		if(curr != null) {
			return curr.value;
		} else {
			throw new ArrayIndexOutOfBoundsException(String.format("Index %d out of bounds", i));
		}
	}

	@Override
	public void set(int i, T element) {
		if(i < 0) {
			throw new ArrayIndexOutOfBoundsException(String.format("Index %d out of bounds", i));
		}
		Node<T> curr = begin;
		int j = 0;
		while(curr != null && j < i) {
			j++;
			curr = curr.next;
		}
		if(curr != null) {
			curr.value = element;
		} else {
			throw new ArrayIndexOutOfBoundsException(String.format("Index %d out of bounds", i));
		}
	}

	@Override
	public void add(T element) {
		Node<T> curr = new Node<>();
		curr.value = element;
		curr.next = null;
		curr.prev = end;
		if(end != null) {
			end.next = curr;
		} else {
			begin = curr;
		}
		end = curr;
	}

	@Override
	public void insert(int i, T element) {}

	@Override
	public void remove(int i) {}

	private static class Node<T> {
		private T value;
		private Node<T> prev;
		private Node<T> next;
	}
}
