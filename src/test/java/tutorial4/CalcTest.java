package tutorial4;

import junit.framework.TestCase;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalcTest
	extends TestCase
 {

	@Test
	public void testadd(){
		assertTrue(Calc.add(1,2)==3);
	}
}