package lasermaze;

import java.io.IOException;

/**
 * This is a interface. 
 * This interface provides basic functions to solve a Laser Maze.
 * Please create your own Laser Maze game class by implementing this interface. 
 * @author Jingran
 *
 */
public interface Maze {
	
	/**
	 * Get the initial parameters of the laser maze game from the input file. 
	 * Need to be implemented.
	 * @param inputFile file name of the input file. Make sure to include path of the file.
	 */
	public void readParametersFromFile(String inputFile);
	
	/**
	 * Function to find a solution of the Laser Maze game.
	 */
	//public void solveMaze();
	
	public void solveMaze(Status current, MyMirror[][] mirrors, int m, int n);
	
	
	/**
	 * Write the result of the laser maze game to file.
	 * Need to be implemented. 
	 * @param outputFile the name of the output file. Make sure to include path of the file. 
	 * @throws IOException IOException
	 */
	//public void writeResultFile();
	public void writeResultFile(String outputFile) throws IOException;

	
	/**
	 * Get the initial parameters of the laser maze game. 
	 * Need to be implemented. 
	 * @return the initial parameters of the game.
	 */
	public MazeParameters getMazeParameters();
	
	/**
	 * Get the number of the squares traveled by the laser light before the light come out of the maze.
	 * Should return -1 if there is loop in the laser light travel path. 
	 * @return number of the squares traveled
	 */
	public int getLength();
	
	/**
	 * Get the X coordination of the final coordination. 
	 * Should return Integer.MIN_VALUE if there is loop in the laser light travel path. 
	 * @return X coordination of the final coordination
	 */
	public int getFinalCoordinationX();
	
	/**
	 * Get the Y coordination of the final coordination. 
	 * Should return Integer.MIN_VALUE if there is loop in the laser light travel path. 
	 * @return Y coordination of the final coordination
	 * 
	 */
	public int getFinalCoordinationY();
	

}
