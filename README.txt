Laser Maze

This is Java solution to solve simple laser maze puzzle. 

Assumptions: To simplify the question, there are some assumptions: 1) both side of all the mirrors can change the direction of laser light; 2) mirrors can only change the direction of laser light by 90 degree; 3) only two type of mirrors (\ and /) are in the maze; 4) starting point can only be in the empty grid. 

What are in this folder:
*Source code: under /LaserMaze/src/lasermaze
*Test code: under /LaserMaze/test/lasermaze
*Runnable file: /maze.jar
*Project documentation: /LaserMaze/doc
*Test input files and expected output files: /LaserMaze/testcases
*The project summary document: /Laser Maze Assignment Summary.docx

How to use maze.jar to solve your Laser Maze?
To run maze.jar in the command line, switch to the path where maze.jar is in, and type:
maze.jar path_to_inputfile/input_file_name path_to_output_file/output_file_name
If there are white spaces in the path and the filename, use double quote to quote the "file_path/file_name". Please use forward slash "/" in your path. 
maze.jar will solve the Laser Maze game using information given in input file and functions in the lasermaze package, and write the output into the output file. The requirement of input and output file are listed in the instruction document - DataScientistHW-LaserMaze3_updated1.pdf. If the input file is not in the required format, no output file will be generated. 
The input file must always be in the following format, single space as a delimiter and \n as a newline:
5 6    # grid size in X width and Y height
1 4 S  # player coordination as X Y and laser direction
3 4 /  # coordination for a mirror
1 2 \  # coordination for a mirror

outpt format:
9    # number of squares traversed, return -1 if wall is never hit
0 0  # coordination of final square (unnecessary if wall is never hit)
