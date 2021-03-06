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
	
	@Test
	public void testPrintTime(){
		clock.setHours(10);
		clock.setMinutes(10);
		assertEquals(clock.getTime(),"10:10");
	}

	//e.g: input => "03:00", the output should be 270
	//input => "09:30", the output should be 255
	//input => "04:15", the output should be 322.5
	//input => "04:45", the output should be 232.5
	@Test
	public void testGetClockAngle(){
		clock.setHours(3);
		clock.setMinutes(0);
		assertEquals(clock.getClockAngle(),270.00);
	
	}
	
	@Test
	public void testGetClockAngleFail(){
		clock.setHours(13);
		clock.setMinutes(0);
		assertEquals(clock.getClockAngle(),-1.0);
	
	}
	
	@Test
	public void testGetClockAngle9_30(){
		clock.setHours(9);
		clock.setMinutes(30);
		assertEquals(clock.getClockAngle(),255.0);
	
	}

	
	@Test
	public void testGetClockAngle4_15(){
		clock.setHours(4);
		clock.setMinutes(15);
		assertEquals(clock.getClockAngle(),322.5);
	
	}

	
	@Test
	public void testGetClockAngle4_45(){
		clock.setHours(4);
		clock.setMinutes(45);
		assertEquals(clock.getClockAngle(),232.5);
	
	}

}
