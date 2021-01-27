package GraphicsObjects;


/**
 * This Class is used to define a vector in the coordinate system
 * @author Link
 *
 */
public class Vector3f {

	public float x=0;
	public float y=0;
	public float z=0;
	
	public Vector3f() 
	{  
		x = 0.0f;
		y = 0.0f;
		z = 0.0f;
	}
	 
	public Vector3f(float x, float y, float z) 
	{ 
		this.x = x;
		this.y = y;
		this.z = z;
	}
	 
	/**
	 * This method is used to calculate the result of a vector plus another vector
	 * @param Additonal -another vector used to be calculate 
	 * @return a vector that is the result of a vector plus another vector 
	 */
	public Vector3f PlusVector(Vector3f Additonal) 
	{ 
		Vector3f V = new Vector3f(0, 0, 0);
		
		V.x = x + Additonal.x;
		V.y = y + Additonal.y;
		V.z = z + Additonal.z;
		
		return V;
	} 
	  
	/**
	 * This method is used to calculate the result of a vector minus another vector
	 * @param Minus -another vector used to be calculate
	 * @return a vector that is the result of a vector minus another vector
	 */
	public Vector3f MinusVector(Vector3f Minus) 
	{ 
		Vector3f V = new Vector3f(0, 0, 0);
		
		V.x = x - Minus.x;
		V.y = y - Minus.y;
		V.z = z - Minus.z;
		
		return V;
	}
	 
	/**
	 * This method is used to calculate the result of a point plus a vector
	 * @param Additonal -the point used to be calculated
	 * @return a point that is the result of a point plus a vector
	 */
	public Point3f PlusPoint(Point3f Additonal) 
	{ 
		Point3f P = new Point3f(0, 0, 0);
		
		P.x = x + Additonal.x;
		P.y = y + Additonal.y;
		P.z = z + Additonal.z;
		
		return P;
	} 
 
	/**
	 * This method is used to calculate the result of vector * scalar 
	 * @param scale -the scalar used to be calculate
	 * @return the result of vector * scalar
	 */
	public Vector3f byScalar(float scale )
	{
		Vector3f V = new Vector3f(0,0,0);
		
		V.x = x * scale;
		V.y = y * scale;
		V.z = z * scale;
		
		return V;
	}
	 
	/**
	 * this method is used to return the negative form of a vector.
	 * @return the negative form of a vector
	 */
	public Vector3f  NegateVector()
	{
		 Vector3f vector = new Vector3f(0,0,0);
		 
		 vector.x = -x;
		 vector.y = -y;
		 vector.z = -z;
		 
		 return vector;
	}
	
	/**
	 * this method returns a length of a vector
	 * @return the length of a vector
	 */
	public float length()
	{
	   float length;
	   length = (float) Math.sqrt(x*x + y*y + z*z);
	   return length;
	}
	
	/**
	 * the method is use to return the normal form of a vector. 
	 * According to normal vector * vector = 0, let the value of x, y of normal vector become -y, -x of vector respectively.
	 * @return the normal form of a vector
	 */
	public Vector3f Normal()
	{
		Vector3f vector = new Vector3f(0,0,0);
		
		vector.x = -y / (float) Math.sqrt(x * x + y * y);
		vector.y = x / (float) Math.sqrt(x * x + y * y);
		
		return vector;
	} 
	 
	/**
	 * this method is used to calculate the value of dot multiplication between two vectors
	 * @param v another vector to be calculated
	 * @return the value of two vectors dot multiplication
	 */
	public float dot(Vector3f v)
	{ 
		float dotvalue;
		dotvalue = x * v.x + y * v.y + z * v.z;
		return dotvalue;
	}
	
	/**
	 * This method is used to calculate the result of two vectors cross product
	 * @param v -another vector used to be calculated
	 * @return a vector is the result of two vectors cross product
	 */
	public Vector3f cross(Vector3f v)  
	{ 
		Vector3f V1 = new Vector3f(0, 0, 0);
		
		V1.x = y * v.z - z * v.y;
		V1.y = z * v.x - x * v.z;
		V1.z = x * v.y - y * v.x;
		
		return V1;
	}
 
}
	 
	   

/*

										MMMM                                        
										MMMMMM                                      
 										MM MMMM                                    
 										MMI  MMMM                                  
 										MMM    MMMM                                
 										MMM      MMMM                              
  										MM        MMMMM                           
  										MMM         MMMMM                         
  										MMM           OMMMM                       
   										MM             .MMMM                     
MMMMMMMMMMMMMMM                        MMM              .MMMM                   
MM   IMMMMMMMMMMMMMMMMMMMMMMMM         MMM                 MMMM                 
MM                  ~MMMMMMMMMMMMMMMMMMMMM                   MMMM               
MM                                  OMMMMM                     MMMMM            
MM                                                               MMMMM          
MM                                                                 MMMMM        
MM                                                                   ~MMMM      
MM                                                                     =MMMM    
MM                                                                        MMMM  
MM                                                                       MMMMMM 
MM                                                                     MMMMMMMM 
MM                                                                  :MMMMMMMM   
MM                                                                MMMMMMMMM     
MM                                                              MMMMMMMMM       
MM                             ,MMMMMMMMMM                    MMMMMMMMM         
MM              IMMMMMMMMMMMMMMMMMMMMMMMMM                  MMMMMMMM            
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM               ZMMMMMMMM              
MMMMMMMMMMMMMMMMMMMMMMMMMMMMM          MM$             MMMMMMMMM                
MMMMMMMMMMMMMM                       MMM            MMMMMMMMM                  
  									MMM          MMMMMMMM                     
  									MM~       IMMMMMMMM                       
  									MM      DMMMMMMMM                         
 								MMM    MMMMMMMMM                           
 								MMD  MMMMMMMM                              
								MMM MMMMMMMM                                
								MMMMMMMMMM                                  
								MMMMMMMM                                    
  								MMMM                                      
  								MM                                        
                             GlassGiant.com */