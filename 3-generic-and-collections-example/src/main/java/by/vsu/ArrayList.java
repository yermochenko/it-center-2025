package by.vsu;

public class ArrayList<T> {
	private final static int BUFFER_SIZE = 10;
	private Object[] array;
	private int length;

	public ArrayList() {
		array = new Object[BUFFER_SIZE];
		length = 0;
	}

	public ArrayList(int size) {
		array = new Object[size];
		length = size;
	}

	public int size() {
		return length;
	}

	@SuppressWarnings("unchecked")
	public T get(int i) {
		checkIndex(i);
		return (T) array[i];
	}

	public void set(int i, T element) {
		checkIndex(i);
		array[i] = element;
	}

	public void add(T element) {
		if(length == array.length) {
			Object[] newArray = new Object[array.length + BUFFER_SIZE];
			System.arraycopy(array, 0, newArray, 0, array.length);
			array = newArray;
		}
		array[length] = element;
		length++;
	}

	private void checkIndex(int index) {
		if(index < 0 || index >= length) {
			throw new ArrayIndexOutOfBoundsException(String.format("Index %d out of bounds for length %d", index, length));
		}
	}

	public void insert(int i, T s) {}

	public void remove(int i) {}
}
