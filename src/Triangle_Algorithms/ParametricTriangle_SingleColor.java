package Triangle_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;
import GraphicsObjects.Vector3f;

/**
 * The class is used to draw a single color triangle.
 * @author Link
 *
 */
public class ParametricTriangle_SingleColor {
	

	Point3f A;
	Point3f B;
	Point3f C;

	public ParametricTriangle_SingleColor(Point3f a, Point3f b, Point3f c) {
		A = a;
		B = b;
		C = c;
	}
	 

	// Implement in Parametric form ,and comment what it does 
	/**
	 * this method is used to draw a triangle and fill color in it. the d,e,f is the color constants to control which color will be filled inside the triangle. 
	 * The principle of this method is to use a mathematics principle. 
	 * Assume that a point inside triangle named p and its distance to line BC is l, the peak A's distance to line BC d. Then a number alpha = l/d.
	 * Repeat this process to B, AC and C, AB, then get three numbers alpha, beta and gamma. alpha + beta + gamma = 1. 
	 * If a point accept this principle, it must be inside a triangle.
	 * @param g the graphic constant g to draw a picture
	 * @param d the value of red color in RGB
	 * @param e the value of green color in RGB
	 * @param f the value of blue color in RGB
	 */
	public void drawTriangle(Graphics g, double d, double e, double f) {
		float Xmax = Math.max(A.x, B.x);
		float Xmin = Math.min(A.x, B.x);
		float Ymax = Math.max(A.y, B.y);
		float Ymin = Math.min(A.y, B.y);
		float alpha = 0;
		float beta = 0;
		float gamma = 0;
		Point3f P = new Point3f(0, 0, 0);
		
		if(Xmax < C.x) {
			Xmax = C.x;
		}
		 
		if(Xmin > C.x) {
			Xmin = C.x;
		}
		
		if(Ymax < C.y) {
			Ymax = C.y;
		}
		
		if(Ymin > C.y) {
			Ymin = C.y;
		}
		
		
		for(P.x = Xmin; P.x < Xmax; P.x += 0.1) {
			for(P.y = Ymin; P.y < Ymax; P.y += 0.1) {
				alpha = Distance(P, B, C) / Distance(A, B, C);
				gamma = Distance(P, A, B) / Distance(C, A, B);
				beta = Distance(P, A, C) / Distance(B, A, C);
				if(alpha + beta + gamma == 1) {
					setPixel(g, (int) P.x, (int) P.y, d, e, f);
				}
			}
		}
	}

	public void setPixel(Graphics g, int x, int y, double R, double G, double B) {
		
		Color pixelColour = new Color((float) R,(float) G,(float) B);
		g.setColor(pixelColour);
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// centre 0,0 at centre of the
											// screen

	}

	//Implement the distance ,  you may use your previous Distance formulas and comment what it does 
	/**
	 * This the method to calculate a point's the shortest distance to a line.
	 * The principle is same to the method inside ImplicitLine.
	 * @param Check -the point is not on the line
	 * @param Beginning -the beginning point of the line
	 * @param End -the end point of the line
	 * @return a float number is the distance of a point to a line
	 */
	public float Distance(Point3f Check, Point3f Beginning, Point3f End) {
		Vector3f v1 = new Vector3f(0,0,0);
		Vector3f v2 = new Vector3f(0,0,0);
		Vector3f v3 = new Vector3f(0,0,0);
		float distance = 0;
		float d = 0;
		
		v1 = End.MinusPoint(Beginning);
		v2 = Check.MinusPoint(Beginning);
		v3 = v1.Normal();
		
		d = v3.dot(v2);
		distance = Math.abs(d/v3.length());
		
		return distance;
	}

}
