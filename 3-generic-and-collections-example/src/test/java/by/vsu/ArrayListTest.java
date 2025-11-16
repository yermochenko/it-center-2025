package by.vsu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
	@Test
	void test01() {
		ArrayList arrayList = new ArrayList();
		assertEquals(0, arrayList.size());
	}

	@Test
	void test02() {
		ArrayList arrayList = new ArrayList();
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.get(0));
	}

	@Test
	void test03() {
		ArrayList arrayList = new ArrayList();
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.set(0, "test"));
	}

	@Test
	void test04() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("test");
		assertEquals(1, arrayList.size());
	}

	@Test
	void test05() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("test");
		assertEquals("test", arrayList.get(0));
	}

	@Test
	void test06() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("test");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.get(1));
	}

	@Test
	void test07() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("test");
		arrayList.set(0, "abc");
		assertEquals("abc", arrayList.get(0));
	}

	@Test
	void test08() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("test");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.set(1, "abc"));
	}

	@Test
	void test09() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("test A");
		arrayList.add("test B");
		arrayList.add("test C");
		assertEquals(3, arrayList.size());
	}

	@Test
	void test10() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("test A");
		arrayList.add("test B");
		arrayList.add("test C");
		assertEquals("test A", arrayList.get(0));
		assertEquals("test B", arrayList.get(1));
		assertEquals("test C", arrayList.get(2));
	}

	@Test
	void test11() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("test A");
		arrayList.add("test B");
		arrayList.add("test C");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.get(3));
	}

	@Test
	void test12() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("test A");
		arrayList.add("test B");
		arrayList.add("test C");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.get(-1));
	}

	@Test
	void test13() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("test A");
		arrayList.add("test B");
		arrayList.add("test C");
		arrayList.set(0, "abc");
		arrayList.set(1, "xyz");
		arrayList.set(2, "mnk");
		assertEquals("abc", arrayList.get(0));
		assertEquals("xyz", arrayList.get(1));
		assertEquals("mnk", arrayList.get(2));
	}

	@Test
	void test14() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("test A");
		arrayList.add("test B");
		arrayList.add("test C");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.set(3, "abc"));
	}

	@Test
	void test15() {
		ArrayList arrayList = new ArrayList();
		arrayList.add("test A");
		arrayList.add("test B");
		arrayList.add("test C");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.set(-1, "abc"));
	}

	@Test
	void test16() {
		ArrayList arrayList = new ArrayList(3);
		assertEquals(3, arrayList.size());
	}

	@Test
	void test17() {
		ArrayList arrayList = new ArrayList(3);
		assertNull(arrayList.get(0));
		assertNull(arrayList.get(1));
		assertNull(arrayList.get(2));
	}

	@Test
	void test18() {
		ArrayList arrayList = new ArrayList(3);
		arrayList.set(0, "test A");
		arrayList.set(1, "test B");
		arrayList.set(2, "test C");
		assertEquals("test A", arrayList.get(0));
		assertEquals("test B", arrayList.get(1));
		assertEquals("test C", arrayList.get(2));
	}

	@Test
	void test19() {
		ArrayList arrayList = new ArrayList(3);
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.set(3, "test"));
	}

	@Test
	void test20() {
		ArrayList arrayList = new ArrayList(3);
		arrayList.add("test");
		assertEquals(4, arrayList.size());
	}

	@Test
	void test21() {
		ArrayList arrayList = new ArrayList(3);
		arrayList.add("test");
		assertNull(arrayList.get(0));
		assertNull(arrayList.get(1));
		assertNull(arrayList.get(2));
		assertEquals("test", arrayList.get(3));
	}

	@Test
	void test22() {
		ArrayList arrayList = new ArrayList(3);
		arrayList.add("test");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.get(4));
	}

	@Test
	void test23() {
		ArrayList arrayList = new ArrayList(3);
		arrayList.add("test");
		arrayList.set(0, "abc");
		assertEquals("abc", arrayList.get(0));
		assertNull(arrayList.get(1));
		assertNull(arrayList.get(2));
		assertEquals("test", arrayList.get(3));
	}

	@Test
	void test24() {
		ArrayList arrayList = new ArrayList(3);
		arrayList.add("test");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.set(4, "abc"));
	}

	@Test
	void test25() {
		ArrayList arrayList = new ArrayList(3);
		arrayList.add("test A");
		arrayList.add("test B");
		arrayList.add("test C");
		assertEquals(6, arrayList.size());
	}

	@Test
	void test26() {
		ArrayList arrayList = new ArrayList(3);
		arrayList.add("test A");
		arrayList.add("test B");
		arrayList.add("test C");
		assertNull(arrayList.get(0));
		assertNull(arrayList.get(1));
		assertNull(arrayList.get(2));
		assertEquals("test A", arrayList.get(3));
		assertEquals("test B", arrayList.get(4));
		assertEquals("test C", arrayList.get(5));
	}

	@Test
	void test27() {
		ArrayList arrayList = new ArrayList(3);
		arrayList.add("test A");
		arrayList.add("test B");
		arrayList.add("test C");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.get(6));
	}

	@Test
	void test28() {
		ArrayList x = new ArrayList(3);
		x.add("test A");
		x.add("test B");
		x.add("test C");
		x.set(0, "abc");
		x.set(1, "xyz");
		x.set(2, "mnk");
		assertEquals("abc", x.get(0));
		assertEquals("xyz", x.get(1));
		assertEquals("mnk", x.get(2));
		assertEquals("test A", x.get(3));
		assertEquals("test B", x.get(4));
		assertEquals("test C", x.get(5));
	}

	@Test
	void test29() {
		ArrayList arrayList = new ArrayList(3);
		arrayList.add("test A");
		arrayList.add("test B");
		arrayList.add("test C");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.set(6, "abc"));
	}
}
