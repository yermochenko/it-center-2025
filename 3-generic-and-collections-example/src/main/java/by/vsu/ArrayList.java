package by.vsu;

public class ArrayList<T> implements List<T> {
	private Object[] array;

	public ArrayList() {
		array = new Object[0];
	}

	public ArrayList(int size) {
		array = new Object[size];
	}

	@Override
	public int size() {
		return array.length;
	}

	@Override
	@SuppressWarnings("unchecked")
	public T get(int i) {
		return (T) array[i];
	}

	@Override
	public void set(int i, T element) {
		array[i] = element;
	}

	@Override
	public void add(T element) {
		Object[] newArray = new Object[array.length + 1];
		int i;
		for(i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
		array[i] = element;
	}

	@Override
	public void insert(int i, T element) {}

	@Override
	public void remove(int i) {}
}
