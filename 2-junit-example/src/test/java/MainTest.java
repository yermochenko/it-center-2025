import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
	@Test
	void toRomanTest000() {
		assertThrows(RuntimeException.class, () -> Main.toRoman(0));
	}
	@Test
	void toRomanTest001() {
		assertEquals("I", Main.toRoman(1));
	}
	@Test
	void toRomanTest002() {
		assertEquals("II", Main.toRoman(2));
	}
	@Test
	void toRomanTest003() {
		assertEquals("III", Main.toRoman(3));
	}
	@Test
	void toRomanTest004() {
		assertEquals("IV", Main.toRoman(4));
	}
	@Test
	void toRomanTest005() {
		assertEquals("V", Main.toRoman(5));
	}
	@Test
	void toRomanTest006() {
		assertEquals("VI", Main.toRoman(6));
	}
	@Test
	void toRomanTest007() {
		assertEquals("VII", Main.toRoman(7));
	}
	@Test
	void toRomanTest008() {
		assertEquals("VIII", Main.toRoman(8));
	}
	@Test
	void toRomanTest009() {
		assertEquals("IX", Main.toRoman(9));
	}
	@Test
	void toRomanTest010() {
		assertEquals("X", Main.toRoman(10));
	}
	@Test
	void toRomanTest011() {
		assertEquals("XI", Main.toRoman(11));
	}
	@Test
	void toRomanTest013() {
		assertEquals("XIII", Main.toRoman(13));
	}
	@Test
	void toRomanTest014() {
		assertEquals("XIV", Main.toRoman(14));
	}
	@Test
	void toRomanTest015() {
		assertEquals("XV", Main.toRoman(15));
	}
	@Test
	void toRomanTest016() {
		assertEquals("XVI", Main.toRoman(16));
	}
	@Test
	void toRomanTest018() {
		assertEquals("XVIII", Main.toRoman(18));
	}
	@Test
	void toRomanTest019() {
		assertEquals("XIX", Main.toRoman(19));
	}
	@Test
	void toRomanTest020() {
		assertEquals("XX", Main.toRoman(20));
	}
	@Test
	void toRomanTest024() {
		assertEquals("XXIV", Main.toRoman(24));
	}
	@Test
	void toRomanTest025() {
		assertEquals("XXV", Main.toRoman(25));
	}
	@Test
	void toRomanTest026() {
		assertEquals("XXVI", Main.toRoman(26));
	}
	@Test
	void toRomanTest029() {
		assertEquals("XXIX", Main.toRoman(29));
	}
	@Test
	void toRomanTest030() {
		assertEquals("XXX", Main.toRoman(30));
	}
	@Test
	void toRomanTest034() {
		assertEquals("XXXIV", Main.toRoman(34));
	}
	@Test
	void toRomanTest039() {
		assertEquals("XXXIX", Main.toRoman(39));
	}
	@Test
	void toRomanTest040() {
		assertEquals("XL", Main.toRoman(40));
	}
	@Test
	void toRomanTest044() {
		assertEquals("XLIV", Main.toRoman(44));
	}
	@Test
	void toRomanTest049() {
		assertEquals("XLIX", Main.toRoman(49));
	}
	@Test
	void toRomanTest050() {
		assertEquals("L", Main.toRoman(50));
	}
	@Test
	void toRomanTest054() {
		assertEquals("LIV", Main.toRoman(54));
	}
	@Test
	void toRomanTest059() {
		assertEquals("LIX", Main.toRoman(59));
	}
	@Test
	void toRomanTest060() {
		assertEquals("LX", Main.toRoman(60));
	}
	@Test
	void toRomanTest064() {
		assertEquals("LXIV", Main.toRoman(64));
	}
	@Test
	void toRomanTest069() {
		assertEquals("LXIX", Main.toRoman(69));
	}
	@Test
	void toRomanTest070() {
		assertEquals("LXX", Main.toRoman(70));
	}
	@Test
	void toRomanTest074() {
		assertEquals("LXXIV", Main.toRoman(74));
	}
	@Test
	void toRomanTest079() {
		assertEquals("LXXIX", Main.toRoman(79));
	}
	@Test
	void toRomanTest080() {
		assertEquals("LXXX", Main.toRoman(80));
	}
	@Test
	void toRomanTest084() {
		assertEquals("LXXXIV", Main.toRoman(84));
	}
	@Test
	void toRomanTest089() {
		assertEquals("LXXXIX", Main.toRoman(89));
	}
	@Test
	void toRomanTest090() {
		assertEquals("XC", Main.toRoman(90));
	}
	@Test
	void toRomanTest094() {
		assertEquals("XCIV", Main.toRoman(94));
	}
	@Test
	void toRomanTest096() {
		assertEquals("XCVI", Main.toRoman(96));
	}
	@Test
	void toRomanTest099() {
		assertEquals("XCIX", Main.toRoman(99));
	}
	@Test
	void toRomanTest100() {
		assertEquals("C", Main.toRoman(100));
	}
	@Test
	void toRomanTest110() {
		assertEquals("CX", Main.toRoman(110));
	}
	@Test
	void toRomanTest120() {
		assertEquals("CXX", Main.toRoman(120));
	}
	@Test
	void toRomanTest130() {
		assertEquals("CXXX", Main.toRoman(130));
	}
	@Test
	void toRomanTest140() {
		assertEquals("CXL", Main.toRoman(140));
	}
	@Test
	void toRomanTest150() {
		assertEquals("CL", Main.toRoman(150));
	}
	@Test
	void toRomanTest151() {
		assertEquals("CLI", Main.toRoman(151));
	}
	@Test
	void toRomanTest160() {
		assertEquals("CLX", Main.toRoman(160));
	}
	@Test
	void toRomanTest166() {
		assertEquals("CLXVI", Main.toRoman(166));
	}
	@Test
	void toRomanTest170() {
		assertEquals("CLXX", Main.toRoman(170));
	}
	@Test
	void toRomanTest180() {
		assertEquals("CLXXX", Main.toRoman(180));
	}
	@Test
	void toRomanTest190() {
		assertEquals("CXC", Main.toRoman(190));
	}
	@Test
	void toRomanTest194() {
		assertEquals("CXCIV", Main.toRoman(194));
	}
	@Test
	void toRomanTest196() {
		assertEquals("CXCVI", Main.toRoman(196));
	}
	@Test
	void toRomanTest200() {
		assertEquals("CC", Main.toRoman(200));
	}
	@Test
	void toRomanTest240() {
		assertEquals("CCXL", Main.toRoman(240));
	}
	@Test
	void toRomanTest250() {
		assertEquals("CCL", Main.toRoman(250));
	}
	@Test
	void toRomanTest260() {
		assertEquals("CCLX", Main.toRoman(260));
	}
	@Test
	void toRomanTest290() {
		assertEquals("CCXC", Main.toRoman(290));
	}
	@Test
	void toRomanTest300() {
		assertEquals("CCC", Main.toRoman(300));
	}
	@Test
	void toRomanTest340() {
		assertEquals("CCCXL", Main.toRoman(340));
	}
	@Test
	void toRomanTest390() {
		assertEquals("CCCXC", Main.toRoman(390));
	}
	@Test
	void toRomanTest400() {
		assertEquals("CD", Main.toRoman(400));
	}
	@Test
	void toRomanTest440() {
		assertEquals("CDXL", Main.toRoman(440));
	}
	@Test
	void toRomanTest444() {
		assertEquals("CDXLIV", Main.toRoman(444));
	}
	@Test
	void toRomanTest464() {
		assertEquals("CDLXIV", Main.toRoman(464));
	}
	@Test
	void toRomanTest466() {
		assertEquals("CDLXVI", Main.toRoman(466));
	}
	@Test
	void toRomanTest490() {
		assertEquals("CDXC", Main.toRoman(490));
	}
	@Test
	void toRomanTest500() {
		assertEquals("D", Main.toRoman(500));
	}
	@Test
	void toRomanTest501() {
		assertThrows(RuntimeException.class, () -> Main.toRoman(501));
	}
}
