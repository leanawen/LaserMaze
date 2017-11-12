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
	public void solveMaze();
	
	
	/**
	 * Write the result of the laser maze game to file.
	 * Need to be implemented. 
	 * @param outputFile the name of the output file. Make sure to include path of the file. 
	 * @throws IOException IOException
	 */
	//public void writeResultFile();
	public void writeResultFile(String outputFile) throws IOException;

}
