package lasermaze;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test changeDirections function of Mirror class.
 * @author Jingran
 *
 */
public class TestMirrorChangeDirections {
	/*
	 * Test when there is no mirror in a square.
	 */
	@Test
	public void testNoMirror() {
		Mirror testM = new MyMirror();
		String newDirection = testM.changeDirections("N");
		assertEquals(newDirection, "N");
	}
	
	@Test
	public void testNoMirrorS() {
		Mirror testM = new MyMirror();
		String newDirection = testM.changeDirections("S");
		assertEquals(newDirection, "S");
	}
	
	@Test
	public void testNoMirrorW() {
		Mirror testM = new MyMirror();
		String newDirection = testM.changeDirections("W");
		assertEquals(newDirection, "W");
	}
	
	@Test
	public void testNoMirrorE() {
		Mirror testM = new MyMirror();
		String newDirection = testM.changeDirections("E");
		assertEquals(newDirection, "E");
	}
	
	
	@Test
	public void testNoMirrorNlowercase() {
		Mirror testM = new MyMirror();
		String newDirection = testM.changeDirections("n");
		assertEquals(newDirection, "N");
	}
	
	@Test
	public void testNoMirrorSlowercase() {
		Mirror testM = new MyMirror();
		String newDirection = testM.changeDirections("s");
		assertEquals(newDirection, "S");
	}
	
	@Test
	public void testNoMirrorWlowercase() {
		Mirror testM = new MyMirror();
		String newDirection = testM.changeDirections("w");
		assertEquals(newDirection, "W");
	}
	
	@Test
	public void testNoMirrorElowercase() {
		Mirror testM = new MyMirror();
		String newDirection = testM.changeDirections("e");
		assertEquals(newDirection, "E");
	}
	
	
	/*
	 * Test mirror "\"
	 */
	@Test
	public void testMirror1N(){
		Mirror testM = new MyMirror("\\");
		String newDirection = testM.changeDirections("N");
		assertEquals(newDirection, "W");
	}
	
	@Test
	public void testMirror1S(){
		Mirror testM = new MyMirror("\\");
		String newDirection = testM.changeDirections("S");
		assertEquals(newDirection, "E");
	}
	
	@Test
	public void testMirror1W(){
		Mirror testM = new MyMirror("\\");
		String newDirection = testM.changeDirections("W");
		assertEquals(newDirection, "N");
	}
	
	@Test
	public void testMirror1E(){
		Mirror testM = new MyMirror("\\");
		String newDirection = testM.changeDirections("E");
		assertEquals(newDirection, "S");
	}
	
	/*
	 * Test Mirror "\"
	 */
	@Test
	public void testMirror2E(){
		Mirror testM = new MyMirror("/");
		String newDirection = testM.changeDirections("E");
		assertEquals(newDirection, "N");
	}
	
	@Test
	public void testMirror2N(){
		Mirror testM = new MyMirror("/");
		String newDirection = testM.changeDirections("N");
		assertEquals(newDirection, "E");
	}
	
	@Test
	public void testMirror2S(){
		Mirror testM = new MyMirror("/");
		String newDirection = testM.changeDirections("S");
		assertEquals(newDirection, "W");
	}
	
	@Test
	public void testMirror2W(){
		Mirror testM = new MyMirror("/");
		String newDirection = testM.changeDirections("W");
		assertEquals(newDirection, "S");
	}
	
	/*
	 * Test lower case input
	 */
	public void testMirror2Elowercase(){
		Mirror testM = new MyMirror("/");
		String newDirection = testM.changeDirections("e");
		assertEquals(newDirection, "N");
	}
	
	@Test
	public void testMirror2Nlowercase(){
		Mirror testM = new MyMirror("/");
		String newDirection = testM.changeDirections("n");
		assertEquals(newDirection, "E");
	}
	
	@Test
	public void testMirror2Slowercase(){
		Mirror testM = new MyMirror("/");
		String newDirection = testM.changeDirections("s");
		assertEquals(newDirection, "W");
	}
	
	@Test
	public void testMirror2Wlowercase(){
		Mirror testM = new MyMirror("/");
		String newDirection = testM.changeDirections("w");
		assertEquals(newDirection, "S");
	}

}
