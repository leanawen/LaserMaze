package lasermaze;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

/**
 * Test getParameter function of MazeParameter class.
 * @author Jingran
 *
 */
public class TestGetParameters {

	@Test
	public void testCase1() {
		MazeParameters testMaze = new MazeParameters();
		String inputFile = "c:/test/inputtest.txt";
		try {
			testMaze.getParametersFromFile(inputFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(testMaze.getGridSizeX() + " " + testMaze.getGridSizeY());
		System.out.println(testMaze.getStartStatus().getX() +" " + testMaze.getStartStatus().getY() + " " + testMaze.getStartStatus().getDirection());
		System.out.println("mirrors:");
		testMaze.printMirrors();
	}
	
	@Test
	public void testCase2(){
		MazeParameters testMaze = new MazeParameters();
		String inputFile = "c:/test/inputtest3.txt";
		try {
			testMaze.getParametersFromFile(inputFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(testMaze.getGridSizeX() + " " + testMaze.getGridSizeY());
		System.out.println(testMaze.getStartStatus().getX() +" " + testMaze.getStartStatus().getY() + " " + testMaze.getStartStatus().getDirection());
		System.out.println("mirrors:");
		testMaze.printMirrors();
	}

}
