package lasermaze;

import java.io.IOException;

public class Main {
public static void main(String[] args) throws IOException{
		
		/*Check the input format
		 * If the count of argument is less than 2, program will be terminated.
		 */
		if(args.length < 2){
			System.out.println("Please enter the path of your input file and output file name!");
			System.out.println("use:");
			System.out.println("maze.jar /your_input /your_output");
			return;
		}
		
		// get the input file path and name
		String inputfile = "c:/test/inputtest1.txt";
		inputfile = args[0].trim();
		// get the output file path and name
		String outputfile = "c:/test/testWriteFile.txt";
		outputfile = args[1].trim();
		
		
		Maze myMaze = new MyMaze();
		
		// initialize the mazeParameters
		myMaze.readParametersFromFile(inputfile);
		MazeParameters currentParameters = myMaze.getMazeParameters();
		Status startStatus = currentParameters.getStartStatus();
		int gridSizeX = currentParameters.getGridSizeX();
		int gridSizeY = currentParameters.getGridSizeY();
		MyMirror[][] mirrors = currentParameters.getMirrors();
		
		// solve the maze
		myMaze.solveMaze(startStatus, mirrors, gridSizeX, gridSizeY);
		
		// print out the results. Can be commented.
		System.out.println(myMaze.getLength());
		System.out.println(myMaze.getFinalCoordinationX() + " " + myMaze.getFinalCoordinationY());
		
		// write the results to file.
		myMaze.writeResultFile(outputfile);
	}

}
