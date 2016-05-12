package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SCTest {

	@Test
	public void stoc_abcからAbcTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = scUtil.snakeToCamelcase("abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void stoc_abc_defからAbcDefTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = scUtil.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void stoc_abc_def_ghからAbcDefGhTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = scUtil.snakeToCamelcase("abc_def_gh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void stoc_abc__def__ghからAbcDefGhTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = scUtil.snakeToCamelcase("abc__def__gh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void stoc__abc_defからAbcDefTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = scUtil.snakeToCamelcase("_abc_def");
		assertThat(actual, is(expected));
	}

	@Test
	public void ctos_AbcからabcTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "abc";
		String actual = scUtil.camelToSnakecase("Abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void ctos_AbcDefからabc_defTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = scUtil.camelToSnakecase("AbcDef");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void ctos_AbcDefGhからabc_def_ghTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = scUtil.camelToSnakecase("AbcDefGh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void cap_空から空Test() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "";
		String actual = scUtil.capitalize("");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void cap_aからATest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "A";
		String actual = scUtil.capitalize("a");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void cap_xyzからXyzTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = scUtil.capitalize("xyz");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncap_空から空Test() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "";
		String actual = scUtil.uncapitalize("");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncap_AからaTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "a";
		String actual = scUtil.uncapitalize("A");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncap_XyzからxyzTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = scUtil.uncapitalize("Xyz");
		assertThat(actual, is(expected));
	}
}
