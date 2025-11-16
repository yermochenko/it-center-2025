package by.vsu;

public class ArrayList {
	private String[] array;

	public ArrayList() {
		array = new String[0];
	}

	public ArrayList(int size) {
		array = new String[size];
	}

	public int size() {
		return array.length;
	}

	public String get(int i) {
		return array[i];
	}

	public void set(int i, String s) {
		array[i] = s;
	}

	public void add(String s) {
		String[] newArray = new String[array.length + 1];
		int i;
		for(i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
		array[i] = s;
	}

	public void remove(int i) {}
}
