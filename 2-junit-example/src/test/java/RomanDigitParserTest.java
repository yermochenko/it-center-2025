import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanDigitParserTest {
	@Test
	void parseTest000() {
		assertThrows(NumberFormatException.class, () -> RomanDigitParser.parse("123"));
	}

	@Test
	void parseTest001() {
		assertEquals(1, RomanDigitParser.parse("I"));
	}

	@Test
	void parseTest002() {
		assertEquals(2, RomanDigitParser.parse("II"));
	}

	@Test
	void parseTest003() {
		assertEquals(3, RomanDigitParser.parse("III"));
	}

	@Test
	void parseTest004() {
		assertEquals(4, RomanDigitParser.parse("IV"));
	}

	@Test
	void parseTest005() {
		assertEquals(5, RomanDigitParser.parse("V"));
	}

	@Test
	void parseTest006() {
		assertEquals(6, RomanDigitParser.parse("VI"));
	}

	@Test
	void parseTest007() {
		assertEquals(7, RomanDigitParser.parse("VII"));
	}

	@Test
	void parseTest008() {
		assertEquals(8, RomanDigitParser.parse("VIII"));
	}

	@Test
	void parseTest009() {
		assertEquals(9, RomanDigitParser.parse("IX"));
	}

	@Test
	void parseTest010() {
		assertEquals(10, RomanDigitParser.parse("X"));
	}

	@Test
	void parseTest011() {
		assertEquals(11, RomanDigitParser.parse("XI"));
	}

	@Test
	void parseTest013() {
		assertEquals(13, RomanDigitParser.parse("XIII"));
	}

	@Test
	void parseTest014() {
		assertEquals(14, RomanDigitParser.parse("XIV"));
	}

	@Test
	void parseTest015() {
		assertEquals(15, RomanDigitParser.parse("XV"));
	}

	@Test
	void parseTest016() {
		assertEquals(16, RomanDigitParser.parse("XVI"));
	}

	@Test
	void parseTest018() {
		assertEquals(18, RomanDigitParser.parse("XVIII"));
	}

	@Test
	void parseTest019() {
		assertEquals(19, RomanDigitParser.parse("XIX"));
	}

	@Test
	void parseTest020() {
		assertEquals(20, RomanDigitParser.parse("XX"));
	}

	@Test
	void parseTest024() {
		assertEquals(24, RomanDigitParser.parse("XXIV"));
	}

	@Test
	void parseTest025() {
		assertEquals(25, RomanDigitParser.parse("XXV"));
	}

	@Test
	void parseTest026() {
		assertEquals(26, RomanDigitParser.parse("XXVI"));
	}

	@Test
	void parseTest029() {
		assertEquals(29, RomanDigitParser.parse("XXIX"));
	}

	@Test
	void parseTest030() {
		assertEquals(30, RomanDigitParser.parse("XXX"));
	}

	@Test
	void parseTest034() {
		assertEquals(34, RomanDigitParser.parse("XXXIV"));
	}

	@Test
	void parseTest039() {
		assertEquals(39, RomanDigitParser.parse("XXXIX"));
	}

	@Test
	void parseTest040() {
		assertEquals(40, RomanDigitParser.parse("XL"));
	}

	@Test
	void parseTest044() {
		assertEquals(44, RomanDigitParser.parse("XLIV"));
	}

	@Test
	void parseTest049() {
		assertEquals(49, RomanDigitParser.parse("XLIX"));
	}

	@Test
	void parseTest050() {
		assertEquals(50, RomanDigitParser.parse("L"));
	}

	@Test
	void parseTest054() {
		assertEquals(54, RomanDigitParser.parse("LIV"));
	}

	@Test
	void parseTest059() {
		assertEquals(59, RomanDigitParser.parse("LIX"));
	}

	@Test
	void parseTest060() {
		assertEquals(60, RomanDigitParser.parse("LX"));
	}

	@Test
	void parseTest064() {
		assertEquals(64, RomanDigitParser.parse("LXIV"));
	}

	@Test
	void parseTest069() {
		assertEquals(69, RomanDigitParser.parse("LXIX"));
	}

	@Test
	void parseTest070() {
		assertEquals(70, RomanDigitParser.parse("LXX"));
	}

	@Test
	void parseTest074() {
		assertEquals(74, RomanDigitParser.parse("LXXIV"));
	}

	@Test
	void parseTest079() {
		assertEquals(79, RomanDigitParser.parse("LXXIX"));
	}

	@Test
	void parseTest080() {
		assertEquals(80, RomanDigitParser.parse("LXXX"));
	}

	@Test
	void parseTest084() {
		assertEquals(84, RomanDigitParser.parse("LXXXIV"));
	}

	@Test
	void parseTest089() {
		assertEquals(89, RomanDigitParser.parse("LXXXIX"));
	}

	@Test
	void parseTest090() {
		assertEquals(90, RomanDigitParser.parse("XC"));
	}

	@Test
	void parseTest094() {
		assertEquals(94, RomanDigitParser.parse("XCIV"));
	}

	@Test
	void parseTest096() {
		assertEquals(96, RomanDigitParser.parse("XCVI"));
	}

	@Test
	void parseTest099() {
		assertEquals(99, RomanDigitParser.parse("XCIX"));
	}

	@Test
	void parseTest100() {
		assertEquals(100, RomanDigitParser.parse("C"));
	}

	@Test
	void parseTest110() {
		assertEquals(110, RomanDigitParser.parse("CX"));
	}

	@Test
	void parseTest120() {
		assertEquals(120, RomanDigitParser.parse("CXX"));
	}

	@Test
	void parseTest130() {
		assertEquals(130, RomanDigitParser.parse("CXXX"));
	}

	@Test
	void parseTest140() {
		assertEquals(140, RomanDigitParser.parse("CXL"));
	}

	@Test
	void parseTest150() {
		assertEquals(150, RomanDigitParser.parse("CL"));
	}

	@Test
	void parseTest151() {
		assertEquals(151, RomanDigitParser.parse("CLI"));
	}

	@Test
	void parseTest160() {
		assertEquals(160, RomanDigitParser.parse("CLX"));
	}

	@Test
	void parseTest166() {
		assertEquals(166, RomanDigitParser.parse("CLXVI"));
	}

	@Test
	void parseTest170() {
		assertEquals(170, RomanDigitParser.parse("CLXX"));
	}

	@Test
	void parseTest180() {
		assertEquals(180, RomanDigitParser.parse("CLXXX"));
	}

	@Test
	void parseTest190() {
		assertEquals(190, RomanDigitParser.parse("CXC"));
	}

	@Test
	void parseTest194() {
		assertEquals(194, RomanDigitParser.parse("CXCIV"));
	}

	@Test
	void parseTest196() {
		assertEquals(196, RomanDigitParser.parse("CXCVI"));
	}

	@Test
	void parseTest200() {
		assertEquals(200, RomanDigitParser.parse("CC"));
	}

	@Test
	void parseTest240() {
		assertEquals(240, RomanDigitParser.parse("CCXL"));
	}

	@Test
	void parseTest250() {
		assertEquals(250, RomanDigitParser.parse("CCL"));
	}

	@Test
	void parseTest260() {
		assertEquals(260, RomanDigitParser.parse("CCLX"));
	}

	@Test
	void parseTest290() {
		assertEquals(290, RomanDigitParser.parse("CCXC"));
	}

	@Test
	void parseTest300() {
		assertEquals(300, RomanDigitParser.parse("CCC"));
	}

	@Test
	void parseTest340() {
		assertEquals(340, RomanDigitParser.parse("CCCXL"));
	}

	@Test
	void parseTest390() {
		assertEquals(390, RomanDigitParser.parse("CCCXC"));
	}

	@Test
	void parseTest400() {
		assertEquals(400, RomanDigitParser.parse("CD"));
	}

	@Test
	void parseTest440() {
		assertEquals(440, RomanDigitParser.parse("CDXL"));
	}

	@Test
	void parseTest444() {
		assertEquals(444, RomanDigitParser.parse("CDXLIV"));
	}

	@Test
	void parseTest464() {
		assertEquals(464, RomanDigitParser.parse("CDLXIV"));
	}

	@Test
	void parseTest466() {
		assertEquals(466, RomanDigitParser.parse("CDLXVI"));
	}

	@Test
	void parseTest490() {
		assertEquals(490, RomanDigitParser.parse("CDXC"));
	}

	@Test
	void parseTest500() {
		assertEquals(500, RomanDigitParser.parse("D"));
	}

	@Test
	void parseTest888() {
		assertEquals(888, RomanDigitParser.parse("DCCCLXXXVIII"));
	}
}
