package by.vsu;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ListInsertTest {
	static Stream<List<String>> list() {
		return Stream.of(new ArrayList<>(3), new LinkedList<>(3));
	}

	@ParameterizedTest
	@MethodSource("list")
	void test01(List<String> list) {
		list.set(0, "abc");
		list.set(1, "xyz");
		list.set(2, "mnk");
		list.insert(0, "pqr");
		assertEquals(4, list.size());
		assertEquals("pqr", list.get(0));
		assertEquals("abc", list.get(1));
		assertEquals("xyz", list.get(2));
		assertEquals("mnk", list.get(3));
	}

	@ParameterizedTest
	@MethodSource("list")
	void test02(List<String> list) {
		list.set(0, "abc");
		list.set(1, "xyz");
		list.set(2, "mnk");
		list.insert(1, "pqr");
		assertEquals(4, list.size());
		assertEquals("abc", list.get(0));
		assertEquals("pqr", list.get(1));
		assertEquals("xyz", list.get(2));
		assertEquals("mnk", list.get(3));
	}

	@ParameterizedTest
	@MethodSource("list")
	void test03(List<String> list) {
		list.set(0, "abc");
		list.set(1, "xyz");
		list.set(2, "mnk");
		list.insert(2, "pqr");
		assertEquals(4, list.size());
		assertEquals("abc", list.get(0));
		assertEquals("xyz", list.get(1));
		assertEquals("pqr", list.get(2));
		assertEquals("mnk", list.get(3));
	}

	@ParameterizedTest
	@MethodSource("list")
	void test04(List<String> list) {
		list.set(0, "abc");
		list.set(1, "xyz");
		list.set(2, "mnk");
		list.insert(3, "pqr");
		assertEquals(4, list.size());
		assertEquals("abc", list.get(0));
		assertEquals("xyz", list.get(1));
		assertEquals("mnk", list.get(2));
		assertEquals("pqr", list.get(3));
	}

	@ParameterizedTest
	@MethodSource("list")
	void test05(List<String> list) {
		list.set(0, "abc");
		list.set(1, "xyz");
		list.set(2, "mnk");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.insert(-1, "pqr"));
	}

	@ParameterizedTest
	@MethodSource("list")
	void test06(List<String> list) {
		list.set(0, "abc");
		list.set(1, "xyz");
		list.set(2, "mnk");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.insert(4, "pqr"));
	}
}
