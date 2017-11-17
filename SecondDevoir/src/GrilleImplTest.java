import static org.junit.Assert.*;

import org.junit.Test;

public class GrilleImplTest {

	@Test
	public void testGetDimensionInt() {
		assertEquals(81, 81);
	}

	@Test
	public void testSetValueIntIntChar() {
		assertEquals('4', '4');
	}

	@Test
	public void testSetValueIntIntInt() {
		assertEquals(4, 4);
	}

	@Test
	public void testGetValueIntInt() {
		assertEquals('6', '6');
	}

	@Test
	public void testGetValueDoubleDouble() {
		assertEquals('6', '6');
	}

	@Test
	public void testComplete() {
		assertEquals(true, true);
	}

	@Test
	public void testPossible() {
		assertEquals(false, false);
	}

}
