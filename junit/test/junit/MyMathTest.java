package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {
	// MyMath.sum
	// For 1,2,3 => 1+2+3 = 6 should be returned.

	@Test
	public void sum_with3numbers() {
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] { 1, 2, 3 });
		assertEquals(6, result);
	}

}
