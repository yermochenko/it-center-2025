package by.vsu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListRemoveTest {
	@Test
	void test01() {
		ArrayList<String> arrayList = new ArrayList<>(3);
		arrayList.set(0, "abc");
		arrayList.set(1, "xyz");
		arrayList.set(2, "mnk");
		arrayList.remove(0);
		assertEquals(2, arrayList.size());
		assertEquals("xyz", arrayList.get(0));
		assertEquals("mnk", arrayList.get(1));
	}

	@Test
	void test02() {
		ArrayList<String> arrayList = new ArrayList<>(3);
		arrayList.set(0, "abc");
		arrayList.set(1, "xyz");
		arrayList.set(2, "mnk");
		arrayList.remove(1);
		assertEquals(2, arrayList.size());
		assertEquals("abc", arrayList.get(0));
		assertEquals("mnk", arrayList.get(1));
	}

	@Test
	void test03() {
		ArrayList<String> arrayList = new ArrayList<>(3);
		arrayList.set(0, "abc");
		arrayList.set(1, "xyz");
		arrayList.set(2, "mnk");
		arrayList.remove(2);
		assertEquals(2, arrayList.size());
		assertEquals("abc", arrayList.get(0));
		assertEquals("xyz", arrayList.get(1));
	}

	@Test
	void test04() {
		ArrayList<String> arrayList = new ArrayList<>(3);
		arrayList.set(0, "abc");
		arrayList.set(1, "xyz");
		arrayList.set(2, "mnk");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.remove(-1));
	}

	@Test
	void test05() {
		ArrayList<String> arrayList = new ArrayList<>(3);
		arrayList.set(0, "abc");
		arrayList.set(1, "xyz");
		arrayList.set(2, "mnk");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.remove(3));
	}
}
