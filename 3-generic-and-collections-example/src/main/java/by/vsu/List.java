package by.vsu;

public interface List<T> {
	int size();

	T get(int i);

	void set(int i, T element);

	void add(T element);

	void insert(int i, T element);

	void remove(int i);
}
