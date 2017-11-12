package lasermaze;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This MazeParameters class is used to represent the initial parameters of the Maze.
 *  
 */
public class MazeParameters {
	/**
	 * gridSizeX : the length of X axis of the maze grid.
	 */
	private int gridSizeX;
	
	/** 
	 * gridSizeY : the length of Y axis of the maze grid.
	 */
	private int gridSizeY;
	
	/**
	 * startStatus: the start point and start direction of the game. startStatus is a entity of Status class. 
	 */
	private Status startStatus;
	
	/**
	 * mirrors : the array to store the mirror information of the game. The value of the array element is a Mirror entity.
    */
	private MyMirror[][] mirrors;
	
	public MazeParameters(){
		
	}
	
	/**
	 * MazeParameter Constructor
	 * @param inputFile name of the input file. Make sure to include path of the file.
	 * @throws IOException IOException
	 */
	public MazeParameters(String inputFile) throws IOException{
		
		try{
			FileReader fileReader = new FileReader(inputFile);
			
			BufferedReader br = new BufferedReader(fileReader);
			
			// get the size of the grid
			String line1 = br.readLine();
			String[] grid = line1.trim().split(" ");
			if(grid.length < 2){
				System.out.println("Input file format of line1 is not correct. Please check your input file");
				br.close();
				return;
			}else{
				int x = Integer.parseInt(grid[0]);
				int y = Integer.parseInt(grid[1]);
				gridSizeX = x;
				gridSizeY = y;
				
				mirrors = new MyMirror[gridSizeY][gridSizeX];
				
			}
			
			for(int i = 0 ; i < mirrors.length; i++){
				for(int j = 0; j < mirrors[0].length; j++){
					mirrors[i][j] = new MyMirror("0");
				}
			}
			
			// get start point and start direction
			String line2 = br.readLine();
			String[] start = line2.trim().split(" ");
			if(start.length < 3){
				System.out.println("Input file format of line2 is not correct. Please check the input file!");
				br.close();
				return;
			}else{
				int x = Integer.parseInt(start[0]);
				int y = Integer.parseInt(start[1]);
				String direction = start[2];
				startStatus = new Status(x, y, direction);
			}
			
			// get the mirrors information
			String line3 = br.readLine().trim();
			while(line3 != null){
				String[] currentMirror = line3.trim().split(" ");
				if(currentMirror.length < 3){
					if(currentMirror[0].isEmpty()){
						System.out.println("No mirror");
						return;
					}
					System.out.println("Input file format of mirrors is not correct. Please check the input file!");
					br.close();
					return;
				}else{
					int x = Integer.parseInt(currentMirror[0]);
					int y = Integer.parseInt(currentMirror[1]);
					String status = currentMirror[2];
					mirrors[y][x].setStatus(status);;
				}
				
				line3 = br.readLine();
			}
			
			br.close();
			
			
			
		}catch(FileNotFoundException ex){
			System.out.println("Unable to open the file. Please check the file location!");
		}catch(IOException ex){
			System.out.println("Error reading file");
		}
		
	}
	
	/**
	 * print the arrays of mirrors
	 */
	public void printMirrors(){
		for(int i = mirrors.length -1 ; i >= 0; i--){
			for(int j = 0; j < mirrors[0].length; j++){
				System.out.print(mirrors[i][j].getStatus() + " ");
			}
			System.out.println();
		}
		
	}
	
	/**
	 * get the value of the maze grid length
	 * @return the length of the maze gird
	 */
	public int getGridSizeX() {
		return this.gridSizeX;
	}
	
	/**
	 * set the length of the GridSize
	 * @param gridSizeX the length of the maze grid
	 */
	public void setGridSizeX(int gridSizeX) {
		this.gridSizeX = gridSizeX;
	}
	
	/**
	 * get the width of the maze grid
	 * @return the width of the maze grid
	 */
	public int getGridSizeY() {
		return this.gridSizeY;
	}
	
	/**
	 * set the width of the maze grid
	 * @param gridSizeY the width of the maze grid
	 */
	public void setGridSizeY(int gridSizeY) {
		this.gridSizeY = gridSizeY;
	}
	
	/**
	 * get the start status of the game. return value is a Status. 
	 * @return the start of the game
	 */
	public Status getStartStatus() {
		return this.startStatus;
	}

	/**
	 * set the startStatus. the input is a Status
	 * @param startStatus the start status of the maze game. It should be a Status entity.
	 */
	public void setStartStatus(Status startStatus) {
		this.startStatus = startStatus;
	}
	
	/**
	 * get the matrix of the mirror. the value of the array element is a Mirror
	 * @return the matrix of mirror
	 */
	public MyMirror[][] getMirrors() {
		return this.mirrors;
	}
	
	/**
	 * change the mirror matrix
	 * @param mirrors an array of Mirrors
	 */
	public void setMirrors(MyMirror[][] mirrors) {
		this.mirrors = mirrors;
	}
	
	/**
	 * Function to set the parameters using the file. This methods is a duplicate of the MazeParameters constructor.
	 * Can be used to set all initial parameters of the game
	 * @param inputFile the name of the input file. Make sure to include the path of the file.
	 * @throws IOException IOException
	 */
	public void getParametersFromFile(String inputFile) throws IOException{
		System.out.println(inputFile);
		
		try{
			FileReader fileReader = new FileReader(inputFile);
			
			BufferedReader br = new BufferedReader(fileReader);
			
			// get the size of the grid
			String line1 = br.readLine();
			String[] grid = line1.trim().split(" ");
			if(grid.length < 2){
				System.out.println("Input file format of line1 is not correct. Please check your input file");
				br.close();
				return;
			}else{
				int x = Integer.parseInt(grid[0]);
				int y = Integer.parseInt(grid[1]);
				gridSizeX = x;
				gridSizeY = y;
				
				mirrors = new MyMirror[gridSizeY][gridSizeX];
				
			}
			
			for(int i = 0 ; i < mirrors.length; i++){
				for(int j = 0; j < mirrors[0].length; j++){
					mirrors[i][j] = new MyMirror("0");
				}
			}
			
			// get start point and start direction
			String line2 = br.readLine().trim();
			String[] start = line2.trim().split(" ");
			if(start.length < 3){
				System.out.println("Input file format of line2 is not correct. Please check the input file!");
				br.close();
				return;
			}else{
				int x = Integer.parseInt(start[0]);
				int y = Integer.parseInt(start[1]);
				String direction = start[2];
				startStatus = new Status(x, y, direction);
			}
			
			// get the mirrors information
			String line3 = br.readLine().trim();
			while(line3 != null){				
				String[] currentMirror = line3.trim().split(" ");  
				if(currentMirror.length < 3){
					if(currentMirror[0].isEmpty()){
						System.out.println("No mirrors!");
						return;
					}
					System.out.println("Input file format of mirror is not correct. Please check the input file!");
					br.close();
					return;
				}else{
					int x = Integer.parseInt(currentMirror[0]);
					int y = Integer.parseInt(currentMirror[1]);
					String status = currentMirror[2];
					mirrors[y][x].setStatus(status);;
				}
				
				line3 = br.readLine();
			}
			
			br.close();
			
			
			
		}catch(FileNotFoundException ex){
			System.out.println("Unable to open the file. Please check the file location!");
		}catch(IOException ex){
			System.out.println("Error reading file");
		}
		
	}
}