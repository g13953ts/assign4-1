package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SCTest {

	@Test
	public void stocTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "AbCd";
		String actual = scUtil.snakeToCamelcase("ab_cd");
		assertThat(actual, is(expected));
	}

	@Test
	public void ctosTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "abc_de";
		String actual = scUtil.camelToSnakecase("AbcDe");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "Ab";
		String actual = scUtil.capitalize("ab");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapTest() {
		SnakeCamelUtil scUtil = new SnakeCamelUtil();
		String expected = "aBC";
		String actual = scUtil.uncapitalize("ABC");
		assertThat(actual, is(expected));
	}
}
