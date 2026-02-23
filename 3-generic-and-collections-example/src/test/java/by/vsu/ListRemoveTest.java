package by.vsu;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ListRemoveTest {
	static Stream<List<String>> list() {
		return Stream.of(new ArrayList<>(3), new LinkedList<>(3));
	}

	@ParameterizedTest
	@MethodSource("list")
	void test01(List<String> list) {
		list.set(0, "abc");
		list.set(1, "xyz");
		list.set(2, "mnk");
		list.remove(0);
		assertEquals(2, list.size());
		assertEquals("xyz", list.get(0));
		assertEquals("mnk", list.get(1));
	}

	@ParameterizedTest
	@MethodSource("list")
	void test02(List<String> list) {
		list.set(0, "abc");
		list.set(1, "xyz");
		list.set(2, "mnk");
		list.remove(1);
		assertEquals(2, list.size());
		assertEquals("abc", list.get(0));
		assertEquals("mnk", list.get(1));
	}

	@ParameterizedTest
	@MethodSource("list")
	void test03(List<String> list) {
		list.set(0, "abc");
		list.set(1, "xyz");
		list.set(2, "mnk");
		list.remove(2);
		assertEquals(2, list.size());
		assertEquals("abc", list.get(0));
		assertEquals("xyz", list.get(1));
	}

	@ParameterizedTest
	@MethodSource("list")
	void test04(List<String> list) {
		list.set(0, "abc");
		list.set(1, "xyz");
		list.set(2, "mnk");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(-1));
	}

	@ParameterizedTest
	@MethodSource("list")
	void test05(List<String> list) {
		list.set(0, "abc");
		list.set(1, "xyz");
		list.set(2, "mnk");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(3));
	}
}
