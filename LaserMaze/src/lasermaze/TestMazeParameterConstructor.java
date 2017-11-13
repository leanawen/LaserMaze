package lasermaze;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
/**
 * Test constructor of MazeParameter Class.
 * @author Jingran
 *
 */

public class TestMazeParameterConstructor {

	@Test
	public void testCase1() throws IOException {
		String inputfile = "c:/test/inputtest.txt";
		MazeParameters testMaze = new MazeParameters(inputfile);
		int gridX = testMaze.getGridSizeX();
		int gridY = testMaze.getGridSizeY();
		Status startStatus = testMaze.getStartStatus();
		
		System.out.println(testMaze.getGridSizeX() + " " + testMaze.getGridSizeY());
		System.out.println(testMaze.getStartStatus().getX() +" " + testMaze.getStartStatus().getY() + " " + testMaze.getStartStatus().getDirection());
		System.out.println("mirrors:");
		testMaze.printMirrors();
		
		assertEquals(gridX, 5);
		assertEquals(gridY, 6);
		assertEquals(startStatus.getX(), 1);
		assertEquals(startStatus.getY(), 4);
		assertEquals(startStatus.getDirection(),"S");
	}

	@Test
	public void testCase2() throws IOException {
		String inputfile = "c:/test/inputtest3.txt";
		MazeParameters testMaze = new MazeParameters(inputfile);
		int gridX = testMaze.getGridSizeX();
		int gridY = testMaze.getGridSizeY();
		Status startStatus = testMaze.getStartStatus();
		
		System.out.println(testMaze.getGridSizeX() + " " + testMaze.getGridSizeY());
		System.out.println(testMaze.getStartStatus().getX() +" " + testMaze.getStartStatus().getY() + " " + testMaze.getStartStatus().getDirection());
		System.out.println("mirrors:");
		testMaze.printMirrors();
		
		assertEquals(gridX, 5);
		assertEquals(gridY, 6);
		assertEquals(startStatus.getX(), 3);
		assertEquals(startStatus.getY(), 4);
		assertEquals(startStatus.getDirection(),"S");
	}
	
	
	@Test
	public void testCase3() throws IOException {
		String inputfile = "c:/test/inputtest5.txt";
		MazeParameters testMaze = new MazeParameters(inputfile);
		int gridX = testMaze.getGridSizeX();
		int gridY = testMaze.getGridSizeY();
		Status startStatus = testMaze.getStartStatus();
		
		System.out.println(testMaze.getGridSizeX() + " " + testMaze.getGridSizeY());

		assertEquals(gridX, 3);
		assertEquals(gridY, 4);
		assertEquals(startStatus, null);

	}
	
	@Test
	public void testCase4() throws IOException {
		String inputfile = "c:/test/inputtest6.txt";
		MazeParameters testMaze = new MazeParameters(inputfile);
		int gridX = testMaze.getGridSizeX();
		int gridY = testMaze.getGridSizeY();
		Status startStatus = testMaze.getStartStatus();
		
		//System.out.println(testMaze.getGridSizeX() + " " + testMaze.getGridSizeY());

		assertEquals(gridX, 3);
		assertEquals(gridY, 4);
		assertEquals(startStatus, null);

	}
	
	@Test
	public void testCase5() throws IOException {
		String inputfile = "c:/test/inputtest7.txt";
		MazeParameters testMaze = new MazeParameters(inputfile);
		int gridX = testMaze.getGridSizeX();
		int gridY = testMaze.getGridSizeY();
		Status startStatus = testMaze.getStartStatus();
		
		//System.out.println(testMaze.getGridSizeX() + " " + testMaze.getGridSizeY());

		assertEquals(gridX, 3);
		assertEquals(gridY, 4);
		assertEquals(startStatus, null);

	}
	
	@Test
	public void testCase6() throws IOException {
		String inputfile = "c:/test/inputtest8.txt";
		MazeParameters testMaze = new MazeParameters(inputfile);
		int gridX = testMaze.getGridSizeX();
		int gridY = testMaze.getGridSizeY();
		Status startStatus = testMaze.getStartStatus();
		
		//System.out.println(testMaze.getGridSizeX() + " " + testMaze.getGridSizeY());

		assertEquals(gridX, 3);
		assertEquals(gridY, 4);
		assertEquals(startStatus, null);

	}
	
	@Test
	public void testCase7() throws IOException {
		String inputfile = "c:/test/inputtest9.txt";
		MazeParameters testMaze = new MazeParameters(inputfile);
		int gridX = testMaze.getGridSizeX();
		int gridY = testMaze.getGridSizeY();
		Status startStatus = testMaze.getStartStatus();
		
		//System.out.println(testMaze.getGridSizeX() + " " + testMaze.getGridSizeY());

		assertEquals(gridX, 3);
		assertEquals(gridY, 4);
		assertEquals(startStatus, null);

	}
	
	@Test
	public void testCase8() throws IOException {
		String inputfile = "c:/test/inputtest10.txt";
		MazeParameters testMaze = new MazeParameters(inputfile);
		int gridX = testMaze.getGridSizeX();
		int gridY = testMaze.getGridSizeY();
		Status startStatus = testMaze.getStartStatus();
		
		//System.out.println(testMaze.getGridSizeX() + " " + testMaze.getGridSizeY());

		assertEquals(gridX, 30);
		assertEquals(gridY, 40);
		assertEquals(startStatus.getX(), 1);
		assertEquals(startStatus.getY(), 2);
		assertEquals(startStatus.getDirection(),"N");

	}
}
