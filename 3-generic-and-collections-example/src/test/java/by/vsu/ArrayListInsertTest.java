package by.vsu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayListInsertTest {
	@Test
	void test01() {
		ArrayList<String> arrayList = new ArrayList<>(3);
		arrayList.set(0, "abc");
		arrayList.set(1, "xyz");
		arrayList.set(2, "mnk");
		arrayList.insert(0, "pqr");
		assertEquals(4, arrayList.size());
		assertEquals("pqr", arrayList.get(0));
		assertEquals("abc", arrayList.get(1));
		assertEquals("xyz", arrayList.get(2));
		assertEquals("mnk", arrayList.get(3));
	}

	@Test
	void test02() {
		ArrayList<String> arrayList = new ArrayList<>(3);
		arrayList.set(0, "abc");
		arrayList.set(1, "xyz");
		arrayList.set(2, "mnk");
		arrayList.insert(1, "pqr");
		assertEquals(4, arrayList.size());
		assertEquals("abc", arrayList.get(0));
		assertEquals("pqr", arrayList.get(1));
		assertEquals("xyz", arrayList.get(2));
		assertEquals("mnk", arrayList.get(3));
	}

	@Test
	void test03() {
		ArrayList<String> arrayList = new ArrayList<>(3);
		arrayList.set(0, "abc");
		arrayList.set(1, "xyz");
		arrayList.set(2, "mnk");
		arrayList.insert(2, "pqr");
		assertEquals(4, arrayList.size());
		assertEquals("abc", arrayList.get(0));
		assertEquals("xyz", arrayList.get(1));
		assertEquals("pqr", arrayList.get(2));
		assertEquals("mnk", arrayList.get(3));
	}

	@Test
	void test04() {
		ArrayList<String> arrayList = new ArrayList<>(3);
		arrayList.set(0, "abc");
		arrayList.set(1, "xyz");
		arrayList.set(2, "mnk");
		arrayList.insert(3, "pqr");
		assertEquals(4, arrayList.size());
		assertEquals("abc", arrayList.get(0));
		assertEquals("xyz", arrayList.get(1));
		assertEquals("mnk", arrayList.get(2));
		assertEquals("pqr", arrayList.get(3));
	}

	@Test
	void test05() {
		ArrayList<String> arrayList = new ArrayList<>(3);
		arrayList.set(0, "abc");
		arrayList.set(1, "xyz");
		arrayList.set(2, "mnk");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.insert(-1, "pqr"));
	}

	@Test
	void test06() {
		ArrayList<String> arrayList = new ArrayList<>(3);
		arrayList.set(0, "abc");
		arrayList.set(1, "xyz");
		arrayList.set(2, "mnk");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.insert(4, "pqr"));
	}
}
