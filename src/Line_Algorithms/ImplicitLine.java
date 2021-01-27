package Line_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;
import GraphicsObjects.Vector3f;

/**
 * This Class is used to draw a Line in ImplicitLine Form
 * @author Link
 *
 */
public class ImplicitLine {

	Point3f Start;
	Point3f End;

	public ImplicitLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;

	}

	// Implement in Explict form , Extra marks for reducing the search space
	// before you draw the line , and comment what the method does 
	/**
	 * This method is used to draw a line with the ImplicitLine Form.
	 * The principle of this method is to draw a little pixel that is near with wanted line.
	 * And when these little pixels link together, wanted line occurs.  
	 * @param g -the graphic used to draw the line 
	 */
	public void drawLine(Graphics g) {
		Point3f p = new Point3f(0,0,0);
		float x1 = Start.x;
		float y1 = Start.y;
		float x2 = End.x;
		float y2 = End.y;
		
		if(x2 > x1) { 
			if(y2 > y1) {
				for(p.x = x1; p.x < x2; p.x++) {
					for(p.y = y1; p.y < y2; p.y++) {
						if(Distance(p, Start, End) < 0.5) {
							setPixel(g, (int) (p.x), (int) (p.y));
						}
					}
				}
			}else { //y2 < y1
				for(p.x = x1; p.x < x2; p.x++) {
					for(p.y = y2; p.y < y1; p.y++) {
						if(Distance(p, Start, End) < 0.5) {
							setPixel(g, (int) (p.x), (int) (p.y));
						}
					}
				}
			}
		}else { // x2 < x1
			if(y2 > y1) {
				for(p.x = x2; p.x < x1; p.x++) {
					for(p.y = y1; p.y < y2; p.y++) {
						if(Distance(p, Start, End) < 0.5) {
							setPixel(g, (int) (p.x), (int) (p.y));
						}
					}
				}
			}else { // y2 < y1
				for(p.x = x2; p.x < x1; p.x++) {
					for(p.y = y2; p.y < y1; p.y++) {
						if(Distance(p, Start, End) < 0.5) {
							setPixel(g, (int) (p.x), (int) (p.y));
						}
					}
				}
			}
		}
	}

	 
	//implement Distance formulas using your notes , and comment what the method does
	/**
	 * This the method to calculate a point's the shortest distance to a line.
	 * The principle of this distance method is to use the length of a vector * COS¦È to get the length of a line vertical to a line and cross a point out of the line 
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

	// I have implemented this method to adapt Swings coordinate system
	public void setPixel(Graphics g, int x, int y) {
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// centre 0,0 at centre of the
											// screen

	}

}
