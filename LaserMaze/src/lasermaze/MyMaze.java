package lasermaze;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.io.IOException;
import java.util.HashMap;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * This MyMaze class is an implementation of Maze interface.
 * This class can extract parameters from input file, solve the puzzle, and write the results to output file.  
 */
public class MyMaze implements Maze{

	/**
	 * the number of squares traveled.
	 */
	private int length = -1;
	
	/**
	 * finalCoordinationX is the X coordination of the final square. The value is Integer.MIN_VALUE when there is loop in the maze.
	 */
	private int finalCoordinationX;
	
	/**
	 * finalCoordinationY is the Y coordination of the final square. The value is Integer.MIN_VALUE when there is loop in the maze.
	 */
	private int finalCoordinationY;
	
	/**
	 * path is the path of laser light travels.
	 * It is a list of Status
	 */
	private List<Status> path = new LinkedList<>();
	
	/**
	 * mazeParameters is the initial parameters of laser maze game.
	 */
	private MazeParameters mazeParameters;
	
	/**
	 * walkDirect manages how the light travels in the maze grid. 
	 * The key of the map is current direction of the light.
	 * The value of the map is how the x and y coordination should be changed.
	 */
	private static Map<String, int[]> walkDirection = new HashMap<>();
	static{
		int[] north = {0, 1};
		walkDirection.put("N", north);
		int[] south = {0, -1};
		walkDirection.put("S", south);
		int[] east = {1, 0};
		walkDirection.put("E", east);
		int[] west = {-1, 0};
		walkDirection.put("W", west);
	}
	
	/**
	 * Given a current status of the laser light, this function will return the status of next step.
	 * @param current the current status.
	 * @param mirror the mirror in the coordination of current status 
	 * @return the status of next step
	 */
	public Status getNextStep(Status current, MyMirror mirror){
		// direction when the light come in a maze grid
		String currentDirection = current.getDirection();
		// new direction when the light come out of a maze grid
		String newDirection;
		
		// direction will be changed if there is a mirror in current maze grid
		if(mirror.getStatus() == "0"){
			newDirection = currentDirection;
		}else{
			newDirection = mirror.changeDirections(currentDirection);
		}
		
		// current coordination
		int currentX = current.getX();
		int currentY = current.getY();
		
		// coordination of the next step
		int nextX = currentX + walkDirection.get(newDirection)[0];
		int nextY = currentY + walkDirection.get(newDirection)[1];
		
		// the status of next step
		Status next = new Status(nextX, nextY, newDirection);
		return next;
	}
	
	/**
	 * Check if the light is out of the maze grid
	 * @param current the current status of a laser light. Only coordination is used to do the check. 
	 * @param m the length of the maze grid
	 * @param n the width of the maze grid
	 * @return true is the light is out size of the maze gird. false if the light is still in the maze grid.
	 */
	public boolean outOfBoundary(Status current, int m, int n){
		if(current.getX() < 0 || current.getX() >= m || current.getY() < 0 || current.getY() >= n){
			return true;
		}
		return false;
	}
	
	/**
	 * Initialize the mazeParameter by reading the input file.
	 * @param inputfile the name of the input file. Make sure to include the path of the file.
	 */
	public void readParametersFromFile(String inputfile){
		System.out.println(inputfile);
		try {
			mazeParameters = new MazeParameters(inputfile);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * This function is an recursive implementation of solveMaze function of Maze interface. 
	 * If the laser light is travel out of the maze grid, we get the solution of this laser maze puzzle.
	 * If the laser light travels to a square twice with the same travel direction, the light travels in a loop in the maze.  
	 * @param current the current status of the laser light.
	 * @param mirrors an array telling how the mirrors are put in the maze grid. Each array element is a Mirror entity.
	 * @param m the length of the maze grid
	 * @param n the width of the maze grid
	 */
	public void solveMaze(Status current, MyMirror[][] mirrors, int m, int n){
		// if the light is out of the maze grid, we get the solution. 
		if(outOfBoundary(current, m, n)){
			Status last = path.get(path.size() - 1);
			finalCoordinationX = last.getX();
			finalCoordinationY = last.getY();
			return;
		}
		
		/*
		 * if the light travel to a square twice with the same travel direction, the light travels in a loop.
		 * set length to -1.
		 * set finalCoordinationX and finalCoordinationY to Interger.MIN_VALUE. 
		 */

		if(path != null && path.size() != 0){
			for(Status pastStatus : path){
				if(current.equals(pastStatus)){
					System.out.println("The maze has loops!");
					this.length = -1;
					this.finalCoordinationX = Integer.MIN_VALUE;
					this.finalCoordinationY = Integer.MIN_VALUE;
					return;
				}
			}
		}
		
		length++;
		int currentX = current.getX();
		int currentY = current.getY();
		String currentDirection = current.getDirection();
		
		MyMirror currentMirror = mirrors[currentY][currentX];
		boolean isOutBoundary = outOfBoundary(current, m, n);
		/*
		 * print the current status of the light
		 * you can comment this 
		 */
		System.out.println("current: " + currentX + " " + currentY + " Mirror: " + currentMirror.getStatus() + " out of boundary:" + isOutBoundary  );
		
		// get the next status
		Status next = getNextStep(current, currentMirror);
		//System.out.println("  " + next.getX() + " " + next.getY());
		
		// add current status to path
		path.add(current);
		
		// traverse to the next step
		solveMaze(next, mirrors, m, n);
	
	}
	
	/**
	 * This function is an implementation of wrtieResultFile in Maze interface.
	 * If there is a solution of the puzzle, this function will write the number of squares traveled and the final coordination in separate lines.
	 * If there is no solution, this function will write -1 in the output file.
	 * @param outputFile the name of your output file. Make sure to include the path of the file. 
	 * 
	 */
	public void writeResultFile(String outputFile) throws IOException{
		String filename = outputFile;
		BufferedWriter output = null;
		try{
			File file = new File(filename);
			output = new BufferedWriter(new FileWriter(file));
			output.write(""+this.length);
			// check if the light travels in a loop
			if(this.finalCoordinationX != Integer.MIN_VALUE && this.finalCoordinationY != Integer.MIN_VALUE){
				output.newLine();
				output.write(this.finalCoordinationX + " " + this.finalCoordinationY);
			}
			
		}catch ( IOException e ) {
            e.printStackTrace();
        }finally{
        	if(output != null){
        		output.close();
        	}
        }
		
	}
	
	/**
	 * get the number of squares traveled
	 * @return the number of squares traveled
	 */
	public int getLength(){
		return this.length;
	}
	
	/**
	 * get the X coordination of the final coordination.
	 * @return X coordination of the final coordination. Interger.MIN_VALUE if there is no solution
	 */
	public int getFinalCoordinationX(){
		return this.finalCoordinationX;
	}
	
	/**
	 * get the Y coordination of the final coordination.
	 * @return Y coordination of the final coordination. Interger.MIN_VALUE if there is no solution
	 */
	public int getFinalCoordinationY(){
		return this.finalCoordinationY;
	}
	
	/**
	 * get the initial parameters of the maze, including the size of the maze gird, the start point, the start direction, and the mirrors.
	 * @return initial parameters of the maze. Return type is MazeParameter
	 */
	public MazeParameters getMazeParameters(){
		return this.mazeParameters;
	}

}

