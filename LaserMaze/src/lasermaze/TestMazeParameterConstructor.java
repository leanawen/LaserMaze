package lasermaze;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

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
}
