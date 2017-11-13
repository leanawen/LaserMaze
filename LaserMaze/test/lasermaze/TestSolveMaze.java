package lasermaze;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

/**
 * Test the solveMaze function of MyMaze class.
 *
 */

public class TestSolveMaze {

	@Test
	public void testMaze1() throws IOException {
		String inputfile = "c:/test/inputtest.txt";
		MyMaze maze = new MyMaze();
		MazeParameters parameters;
		try {
			parameters = new MazeParameters();
			parameters.getParametersFromFile(inputfile);
			int gridX = parameters.getGridSizeX();
			int gridY = parameters.getGridSizeY();
			MyMirror[][] mirrors = parameters.getMirrors();
			Status startStatus = parameters.getStartStatus();
			
			maze.solveMaze(startStatus, mirrors, gridX, gridY);
			System.out.println(maze.getLength());
			System.out.println(maze.getFinalCoordinationX() + " " + maze.getFinalCoordinationY());
			System.out.println();
			assertEquals(maze.getLength(), 9);
			assertEquals(maze.getFinalCoordinationX(), 0);
			assertEquals(maze.getFinalCoordinationY(), 0);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
	@Test
	public void testMaze2() throws IOException {
		String inputfile = "c:/test/inputtest1.txt";
		MyMaze maze = new MyMaze();
		MazeParameters parameters;
		try {
			parameters = new MazeParameters();
			parameters.getParametersFromFile(inputfile);
			int gridX = parameters.getGridSizeX();
			int gridY = parameters.getGridSizeY();
			MyMirror[][] mirrors = parameters.getMirrors();
			Status startStatus = parameters.getStartStatus();
			
			maze.solveMaze(startStatus, mirrors, gridX, gridY);
			System.out.println(maze.getLength());
			System.out.println(maze.getFinalCoordinationX() + " " + maze.getFinalCoordinationY());
			System.out.println();
			
			assertEquals(maze.getLength(), -1);
			assertEquals(maze.getFinalCoordinationX(), Integer.MIN_VALUE);
			assertEquals(maze.getFinalCoordinationY(), Integer.MIN_VALUE);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void testMaze3() throws IOException {
		String inputfile = "c:/test/inputtest4.txt";
		MyMaze maze = new MyMaze();
		MazeParameters parameters;
		try {
			parameters = new MazeParameters();
			parameters.getParametersFromFile(inputfile);
			int gridX = parameters.getGridSizeX();
			int gridY = parameters.getGridSizeY();
			MyMirror[][] mirrors = parameters.getMirrors();
			Status startStatus = parameters.getStartStatus();
			
			maze.solveMaze(startStatus, mirrors, gridX, gridY);
			System.out.println(maze.getLength());
			System.out.println(maze.getFinalCoordinationX() + " " + maze.getFinalCoordinationY());
			System.out.println();
			
			assertEquals(maze.getLength(), -1);
			assertEquals(maze.getFinalCoordinationX(), Integer.MIN_VALUE);
			assertEquals(maze.getFinalCoordinationY(), Integer.MIN_VALUE);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
