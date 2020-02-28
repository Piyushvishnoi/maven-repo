package pkg1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testmyclass1 {

	@Test
	public void test() {
		myclass1 obj=new myclass1();
		assertEquals(9,obj.sum(3, 6));
	}

}
