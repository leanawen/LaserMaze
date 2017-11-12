package lasermaze;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test getNextStep function of MyMaze class.
 * @author Jingran
 *
 */
public class TestGetNextStatus {

	@Test
	public void testNoMirrorN() {
		MyMaze testMaze = new MyMaze();
		MyMirror mirror = new MyMirror();
		Status current = new Status(1, 4, "N");
		Status next = testMaze.getNextStep(current, mirror);
		assertEquals(next.getX(), 1);
		assertEquals(next.getY(), 5);
		assertEquals(next.getDirection(), "N");
	}
	
	@Test
	public void testNoMirrorS() {
		MyMaze testMaze = new MyMaze();
		MyMirror mirror = new MyMirror();
		Status current = new Status(1, 4, "S");
		Status next = testMaze.getNextStep(current, mirror);
		assertEquals(next.getX(), 1);
		assertEquals(next.getY(), 3);
		assertEquals(next.getDirection(), "S");
	}
	
	@Test
	public void testNoMirrorE() {
		MyMaze testMaze = new MyMaze();
		MyMirror mirror = new MyMirror();
		Status current = new Status(1, 4, "E");
		Status next = testMaze.getNextStep(current, mirror);
		assertEquals(next.getX(), 2);
		assertEquals(next.getY(), 4);
		assertEquals(next.getDirection(), "E");
	}
	
	@Test
	public void testNoMirrorW() {
		MyMaze testMaze = new MyMaze();
		MyMirror mirror = new MyMirror();
		Status current = new Status(1, 4, "W");
		Status next = testMaze.getNextStep(current, mirror);
		assertEquals(next.getX(), 0);
		assertEquals(next.getY(), 4);
		assertEquals(next.getDirection(), "W");
	}
	
	@Test
	public void testMirror1W() {
		MyMaze testMaze = new MyMaze();
		MyMirror mirror = new MyMirror("\\");
		Status current = new Status(1, 4, "W");
		Status next = testMaze.getNextStep(current, mirror);
		assertEquals(next.getX(), 1);
		assertEquals(next.getY(), 5);
		assertEquals(next.getDirection(), "N");
	}
	
	@Test
	public void testMirror1E() {
		MyMaze testMaze = new MyMaze();
		MyMirror mirror = new MyMirror("\\");
		Status current = new Status(1, 4, "E");
		Status next = testMaze.getNextStep(current, mirror);
		assertEquals(next.getX(), 1);
		assertEquals(next.getY(), 3);
		assertEquals(next.getDirection(), "S");
	}
	
	@Test
	public void testMirror1N() {
		MyMaze testMaze = new MyMaze();
		MyMirror mirror = new MyMirror("\\");
		Status current = new Status(1, 4, "N");
		Status next = testMaze.getNextStep(current, mirror);
		assertEquals(next.getX(), 0);
		assertEquals(next.getY(), 4);
		assertEquals(next.getDirection(), "W");
	}
	
	@Test
	public void testMirror1S() {
		MyMaze testMaze = new MyMaze();
		MyMirror mirror = new MyMirror("\\");
		Status current = new Status(1, 4, "S");
		Status next = testMaze.getNextStep(current, mirror);
		assertEquals(next.getX(), 2);
		assertEquals(next.getY(), 4);
		assertEquals(next.getDirection(), "E");
	}
	
	@Test
	public void testMirror2S() {
		MyMaze testMaze = new MyMaze();
		MyMirror mirror = new MyMirror("/");
		Status current = new Status(1, 4, "S");
		Status next = testMaze.getNextStep(current, mirror);
		assertEquals(next.getX(), 0);
		assertEquals(next.getY(), 4);
		assertEquals(next.getDirection(), "W");
	}
	
	@Test
	public void testMirror2N() {
		MyMaze testMaze = new MyMaze();
		MyMirror mirror = new MyMirror("/");
		Status current = new Status(1, 4, "N");
		Status next = testMaze.getNextStep(current, mirror);
		assertEquals(next.getX(), 2);
		assertEquals(next.getY(), 4);
		assertEquals(next.getDirection(), "E");
	}
	
	@Test
	public void testMirror2E() {
		MyMaze testMaze = new MyMaze();
		MyMirror mirror = new MyMirror("/");
		Status current = new Status(1, 4, "E");
		Status next = testMaze.getNextStep(current, mirror);
		assertEquals(next.getX(), 1);
		assertEquals(next.getY(), 5);
		assertEquals(next.getDirection(), "N");
	}
	
	@Test
	public void testMirror2W() {
		MyMaze testMaze = new MyMaze();
		MyMirror mirror = new MyMirror("/");
		Status current = new Status(1, 4, "W");
		Status next = testMaze.getNextStep(current, mirror);
		assertEquals(next.getX(), 1);
		assertEquals(next.getY(), 3);
		assertEquals(next.getDirection(), "S");
	}

}

