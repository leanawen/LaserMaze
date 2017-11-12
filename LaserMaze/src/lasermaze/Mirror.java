package lasermaze;

/**
 * This Mirror interface provide functions which define the characteristics of a mirror.
 * For example, how the mirror change the travel direction of a laser light.
 * @author Jingran
 *
 */

public interface Mirror {
	
	// how the mirror is put in the maze
	public String status = "0";
	
	/**
	 * This function define how the mirror can change the direction of the laser
	 * Need to be implemented in your own code
	 * @param direction the direction of the light when hit the mirror.
	 * @return the direction after pass the mirror
	 */
	// how mirror change direction of a laser light.
	public String changeDirections(String direction);

}
