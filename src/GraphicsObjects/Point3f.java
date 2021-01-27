package GraphicsObjects;

/**
 * This class is used to define a point in coordinate system
 * @author Link
 *
 */
public class Point3f {

	public float x;
	public float y;
	public float z;
	
	
	// default constructor
	public Point3f() { 
		x = 0.0f;
		y = 0.0f;
		z = 0.0f;
	}
	
	//initializing constructor
	public Point3f(float x, float y, float z) { 
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// sometimes for different algorithms we will need to address the point using positions 0 1 2 
	public float getPostion(int postion)
	{
		switch(postion)
		{
		case 0: return x;
		case 1: return y;
		case 2: return z; 
		default: return Float.NaN;  
		} 
	}
	
	public String toString()
	{
		return ("(" + x +"," + y +"," + z +")");
    }


	/**
	 * This method is used to calculate the result of plus a point and a vector
	 * @param Additonal -the Vector used to be plus by the point
	 * @return the point after plus a point and vector
	 */
	public Point3f PlusVector(Vector3f Additonal) { 
		Point3f P = new Point3f(0, 0, 0);
		
		P.x = x + Additonal.x;
		P.y = y + Additonal.y;
		P.z = z + Additonal.z;
		
		return P;
	} 
	
	/**
	 * This method is to calculate the result of a pint minus a vector 
	 * @param Minus -the vector used to be subtracted
	 * @return the point after a point minus a vector  
	 */
	public Point3f MinusVector(Vector3f Minus) { 
		Point3f P = new Point3f(0, 0, 0);
		
		P.x = x - Minus.x;
		P.y = y - Minus.y;
		P.z = z - Minus.z;
		
		return P;
	}
	
	
	/**
	 * This method is used to calculate the vector between two points
	 * @param Minus another point to decided the vector
	 * @return a vector between two points
	 */
	public Vector3f MinusPoint(Point3f Minus) { 
		float x1 = x - Minus.x;
		float y1 = y - Minus.y;
		float z1 = z - Minus.z;
		
		Vector3f vector = new Vector3f(x1,y1,z1);
		
		return vector;
	}
	
	  
	
	
	 
	  
	
}

/*................................................................................
................................................................................
................................................................................
................................................................................
................................................................................
................................................................................
................................................................................
................................................................................
................................................................................
....................................=?7777+.....................................
.............................,8MMMMMMMMMMMMMMMMM7...............................
...........................$MMMMMMMMMMMMMMMMMMMMMM7.............................
........................IMMMMMMMMMMMMMMMMMMMMMMMMMMMM?..........................
......................?MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN........................
.....................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM$......................
...................ZMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.....................
..................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8....................
.................NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM...................
................IMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM..................
................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM$.................
...............=MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZ................
..............:MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM................
..............7MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM:...............
..............DMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZ...............
..............MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8...............
..............MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN...............
..............NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO...............
..............$MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMI...............
..............+MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM=...............
...............8MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM................
................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8................
................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN,................
................=MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM..................
.................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMZ..................
..................MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMD...................
...................?MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.....................
....................8MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM......................
.....................,8MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM,.......................
........................NMMMMMMMMMMMMMMMMMMMMMMMMMMMMN?.........................
..........................NMMMMMMMMMMMMMMMMMMMMMMMMMI...........................
.............................$MMMMMMMMMMMMMMMMMMM?..............................
.................................,I$NMMMMMN$?...................................
................................................................................
................................................................................
................................................................................
.......................................................................*/