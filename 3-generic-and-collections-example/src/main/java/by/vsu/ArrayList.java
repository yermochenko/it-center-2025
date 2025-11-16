package by.vsu;

public class ArrayList {
	private final static int BUFFER_SIZE = 10;
	private String[] array;
	private int length;

	public ArrayList() {
		array = new String[BUFFER_SIZE];
		length = 0;
	}

	public ArrayList(int size) {
		array = new String[size];
		length = size;
	}

	public int size() {
		return length;
	}

	public String get(int i) {
		checkIndex(i);
		return array[i];
	}

	public void set(int i, String s) {
		checkIndex(i);
		array[i] = s;
	}

	public void add(String s) {
		if(length == array.length) {
			String[] newArray = new String[array.length + BUFFER_SIZE];
			System.arraycopy(array, 0, newArray, 0, array.length);
			array = newArray;
		}
		array[length] = s;
		length++;
	}

	private void checkIndex(int index) {
		if(index < 0 || index >= length) {
			throw new ArrayIndexOutOfBoundsException(String.format("Index %d out of bounds for length %d", index, length));
		}
	}

	public void remove(int i) {}
}
