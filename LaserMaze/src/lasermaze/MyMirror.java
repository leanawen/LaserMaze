package lasermaze;

import java.util.Map;
import java.util.HashMap;

/**
 * This MyMirror class is an implementation of Mirror interface.
 * It defines the status of a mirror and the behavior of a mirror.
 * Right now, both sides of the mirror can change the direction of a laser light.
 * @author Jingran
 *
 */
public class MyMirror implements Mirror{
	
	private String status;
	
	/**
	 * directionMap indicates how mirror change the direction of laser light.
	 * The key of the directionMap is the status of the mirror (how the mirror is put in the maze grid).
	 * The value of the directionMap the map of the direction the laser catch the mirror and the direction the laser left the mirror.
	 * You can add more rules here.
	 */
	private static Map<String, Map<String, String>> directionMap = new HashMap<>();
	
	static{
		//this is for the first type of mirror "\"
		Map<String, String> directionMap1 = new HashMap<>();
		directionMap1.put("N", "W");
		directionMap1.put("S", "E");
		directionMap1.put("W", "N");
		directionMap1.put("E", "S");
		directionMap.put("\\", directionMap1);
		
		//this is for the second type of mirror "/"
		Map<String, String> directionMap2 = new HashMap<>();
		directionMap2.put("S", "W");
		directionMap2.put("N", "E");
		directionMap2.put("W", "S");
		directionMap2.put("E", "N");
		directionMap.put("/", directionMap2);
	}
	
	/**
	 * Constructor of MyMirror.
	 * defalut status is "0", which means there is no mirror.
	 */
	public MyMirror(){
		this.status = "0";
	}
	
	/**
	 * Constructor of MyMirror.
	 * Right now support "\"  and "/".
	 * @param status status of a mirror
	 */
	public MyMirror(String status){
		this.status = status;
	}
	
	/**
	 * Get the status of a mirror.
	 * @return the status of the mirror
	 */
	public String getStatus(){
		return this.status;
	}
	
	/**
	 * Set the status of a mirror
	 * @param status status of a mirror
	 */
	public void setStatus(String status){
		this.status = status;
	}
	
	/**
	 * Update the status of a mirror
	 * @param status status of a mirror
	 */
	public void updateStatus(String status){
		this.status = status;
	}
	
	/**
	 * This function returns the direction of a laser after the laser hit a mirror. 
	 * @return the direction of a laser after the laser hit a mirror 
	 */
	public String changeDirections(String direction){
		String directionC = direction.toUpperCase();
		String newDirection = null;
		// no mirror
		if(this.status == "0"){
			newDirection = directionC;
			return newDirection;
		}
		// get the laser direction after a laser hit the mirror 
		newDirection = this.directionMap.get(this.status).get(directionC);
		return newDirection;
	}
	
}
