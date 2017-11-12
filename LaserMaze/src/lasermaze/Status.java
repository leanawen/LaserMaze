package lasermaze;

/**
 * This class is used to record the travel status of laser light.
 * This class records the current coordination of laser light, and the travel direction when laser first touch the coordination.
 * The low left represent (0,0)
 */
public class Status {
	
	private int x;
	private int y;
	private String direction;
	
	/**
	 * Constructor of Status.	 * 
	 * @param x the x coordination
	 * @param y the y coordination
	 * @param direction the initial direction when a laser travel to this grid
	 */
	public Status(int x, int y, String direction){
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	/**
	 * get the X coordination
	 * @return X coordination
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * set the X coordination
	 * @param x X coordination
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * get Y coordination
	 * @return Y coordination
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * set Y coordination
	 * @param y Y coordination
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * get the initial direction
	 * @return the initial direction
	 */
	public String getDirection() {
		return direction;
	}
	
	/**
	 * set the direction of a laser light
	 * @param direction direction of a laser light
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	/**
	 * Compare the two status are equal or not
	 * When the X coordination, Y coordination, and direction of the two status are exactly the same respectively.
	 * @param o a Status entity to be compared. 
	 * @return true when the two status are same; false when the two status are not the same
	 */
	public boolean equals(Status o){
		if(this.x == o.getX() && this.y == o.getY() && this.direction == o.getDirection()){
			return true;
		}
		return false;
	}
	
	

}
