import org.junit.Test;

import junit.framework.TestCase;


public class TestClock extends TestCase {

	ClockPuzzle clock ;
	protected void setUp() throws Exception {
		super.setUp();
		clock = new ClockPuzzle();
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testClockObjNotNull(){
		assertNotNull(clock);
		
	}
}
