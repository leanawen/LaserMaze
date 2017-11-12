package lasermaze;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test readParametersFromFile function of MyMazz class.
 * @author Jingran
 *
 */
public class TestMazeReadParametersFromFiles {

	@Test
	public void testCase1() {
		String inputfile = "c:/test/inputtest.txt";
		MyMaze maze = new MyMaze();
		maze.readParametersFromFile(inputfile);
		MazeParameters testParameters = maze.getMazeParameters();
		int resultX = testParameters.getGridSizeX();
		int resultY = testParameters.getGridSizeY();
		int startX = testParameters.getStartStatus().getX();
		int startY = testParameters.getStartStatus().getY();
		String direction = testParameters.getStartStatus().getDirection();
		MyMirror[][] mirrors = testParameters.getMirrors();
		
				
		System.out.println(testParameters.getGridSizeX());
		System.out.println(testParameters.getGridSizeY());
		System.out.println(testParameters.getStartStatus().getX() + " " + testParameters.getStartStatus().getY());
		testParameters.printMirrors();
		
		assertEquals(resultX, 5);
		assertEquals(resultY, 6);
		assertEquals(startX, 1);
		assertEquals(startY, 4);
		assertEquals(direction, "S");
	}

}
