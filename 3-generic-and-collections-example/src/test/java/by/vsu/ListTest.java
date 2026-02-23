package by.vsu;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
	static Stream<List<String>> emptyList() {
		return Stream.of(new ArrayList<>(), new LinkedList<>());
	}

	static Stream<List<String>> threeElementsList() {
		return Stream.of(new ArrayList<>(3), new LinkedList<>(3));
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test01(List<String> list) {
		assertEquals(0, list.size());
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test02(List<String> list) {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(0));
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test03(List<String> list) {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.set(0, "test"));
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test04(List<String> list) {
		list.add("test");
		assertEquals(1, list.size());
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test05(List<String> list) {
		list.add("test");
		assertEquals("test", list.get(0));
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test06(List<String> list) {
		list.add("test");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(1));
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test07(List<String> list) {
		list.add("test");
		list.set(0, "abc");
		assertEquals("abc", list.get(0));
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test08(List<String> list) {
		list.add("test");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.set(1, "abc"));
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test09(List<String> list) {
		list.add("test A");
		list.add("test B");
		list.add("test C");
		assertEquals(3, list.size());
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test10(List<String> list) {
		list.add("test A");
		list.add("test B");
		list.add("test C");
		assertEquals("test A", list.get(0));
		assertEquals("test B", list.get(1));
		assertEquals("test C", list.get(2));
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test11(List<String> list) {
		list.add("test A");
		list.add("test B");
		list.add("test C");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(3));
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test12(List<String> list) {
		list.add("test A");
		list.add("test B");
		list.add("test C");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(-1));
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test13(List<String> list) {
		list.add("test A");
		list.add("test B");
		list.add("test C");
		list.set(0, "abc");
		list.set(1, "xyz");
		list.set(2, "mnk");
		assertEquals("abc", list.get(0));
		assertEquals("xyz", list.get(1));
		assertEquals("mnk", list.get(2));
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test14(List<String> list) {
		list.add("test A");
		list.add("test B");
		list.add("test C");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.set(3, "abc"));
	}

	@ParameterizedTest
	@MethodSource("emptyList")
	void test15(List<String> list) {
		list.add("test A");
		list.add("test B");
		list.add("test C");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.set(-1, "abc"));
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test16(List<String> list) {
		assertEquals(3, list.size());
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test17(List<String> list) {
		assertNull(list.get(0));
		assertNull(list.get(1));
		assertNull(list.get(2));
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test18(List<String> list) {
		list.set(0, "test A");
		list.set(1, "test B");
		list.set(2, "test C");
		assertEquals("test A", list.get(0));
		assertEquals("test B", list.get(1));
		assertEquals("test C", list.get(2));
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test19(List<String> list) {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.set(3, "test"));
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test20(List<String> list) {
		list.add("test");
		assertEquals(4, list.size());
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test21(List<String> list) {
		list.add("test");
		assertNull(list.get(0));
		assertNull(list.get(1));
		assertNull(list.get(2));
		assertEquals("test", list.get(3));
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test22(List<String> list) {
		list.add("test");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(4));
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test23(List<String> list) {
		list.add("test");
		list.set(0, "abc");
		assertEquals("abc", list.get(0));
		assertNull(list.get(1));
		assertNull(list.get(2));
		assertEquals("test", list.get(3));
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test24(List<String> list) {
		list.add("test");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.set(4, "abc"));
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test25(List<String> list) {
		list.add("test A");
		list.add("test B");
		list.add("test C");
		assertEquals(6, list.size());
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test26(List<String> list) {
		list.add("test A");
		list.add("test B");
		list.add("test C");
		assertNull(list.get(0));
		assertNull(list.get(1));
		assertNull(list.get(2));
		assertEquals("test A", list.get(3));
		assertEquals("test B", list.get(4));
		assertEquals("test C", list.get(5));
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test27(List<String> list) {
		list.add("test A");
		list.add("test B");
		list.add("test C");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(6));
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test28(List<String> list) {
		list.add("test A");
		list.add("test B");
		list.add("test C");
		list.set(0, "abc");
		list.set(1, "xyz");
		list.set(2, "mnk");
		assertEquals("abc", list.get(0));
		assertEquals("xyz", list.get(1));
		assertEquals("mnk", list.get(2));
		assertEquals("test A", list.get(3));
		assertEquals("test B", list.get(4));
		assertEquals("test C", list.get(5));
	}

	@ParameterizedTest
	@MethodSource("threeElementsList")
	void test29(List<String> list) {
		list.add("test A");
		list.add("test B");
		list.add("test C");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.set(6, "abc"));
	}
}
