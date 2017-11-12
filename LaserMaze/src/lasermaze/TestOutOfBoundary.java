package lasermaze;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test outOfBoundary function of MyMaze class.
 * @author Jingran
 *
 */
public class TestOutOfBoundary {

	@Test
	public void testTrue1() {
		MyMaze maze = new MyMaze();
		Status current = new Status(-1, 4, "N");
		boolean result = maze.outOfBoundary(current, 5, 6);
		assertEquals(result, true);
	}
	
	@Test
	public void testTrue2() {
		MyMaze maze = new MyMaze();
		Status current = new Status(6, 4, "N");
		boolean result = maze.outOfBoundary(current, 5, 6);
		assertEquals(result, true);
	}
	
	@Test
	public void testTrue3() {
		MyMaze maze = new MyMaze();
		Status current = new Status(2, 6, "N");
		boolean result = maze.outOfBoundary(current, 5, 6);
		assertEquals(result, true);
	}
	
	@Test
	public void testTrue4() {
		MyMaze maze = new MyMaze();
		Status current = new Status(2, -1, "N");
		boolean result = maze.outOfBoundary(current, 5, 6);
		assertEquals(result, true);
	}
	
	@Test
	public void testFalse1(){
		MyMaze maze = new MyMaze();
		Status current = new Status(2,4,"S");
		boolean result = maze.outOfBoundary(current, 5, 6);
		assertEquals(result, false);
	}
	
	@Test
	public void testFalse2(){
		MyMaze maze = new MyMaze();
		Status current = new Status(2,4,"S");
		boolean result = maze.outOfBoundary(current, 5, 6);
		assertEquals(result, false);
	}


}

