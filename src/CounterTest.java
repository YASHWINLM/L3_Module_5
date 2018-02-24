
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CounterTest {
	static Boolean[] array1 = { true, true, true, false, true, true, true, true, true, false, true, false, true, false,
			false, true, true, true, true, true, false, false, true, true };

	static Boolean[] array2 = new Boolean[605];

	static Boolean[] array3 = new Boolean[605];

	static {
		int index = 0;
		for (; index < 500; index++)
			array2[index] = true;
		for (; index < 5; index++)
			array2[index] = null;
		for (; index < 100; index++)
			array2[index] = false;

		index = 0;
		for (; index < 505; index++)
			array3[index] = null;
		for (; index < 100; index++)
			array3[index] = false;
	}

	@Test
	public void test1() {
		assertEquals("There are 17 sheeps in total", 17, new CounterTest().countSheeps(array1));
	}

	private int countSheeps(Boolean[] array12) {
		int x = 0;
		for (int i = 0; i < array12.length; i++) {

			if (!(array12[i] == null)) {

				if (array12[i]) {
					x += 1;

				}

			}

		}

		return x;
	}

	@Test
	public void test2() {
		assertEquals("There are 500 sheeps in total", 500, new CounterTest().countSheeps(array2));
	}

	@Test
	public void test3() {
		assertEquals("There are 0 sheeps in total", 0, new CounterTest().countSheeps(array3));
	}

}
