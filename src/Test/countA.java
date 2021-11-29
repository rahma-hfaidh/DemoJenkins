package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class countA {

	@Test
	public void test() {
		JunitTest test =new JunitTest();
		int output = test.countA("alphabet");
		assertEquals(3,output);
	}

}
