package Line_Algorithms;

import java.awt.Graphics;

import GraphicsObjects.Point3f;

/**
 * This Class is used to draw a line in ParametricLine Form
 * @author Link
 *
 */
public class ParametricLine {

	Point3f Start;
	Point3f End;

	public ParametricLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;

	}

	/**
	 * This method is used to draw a line with ParametricLine Form.
	 * The parametric form is just to minimize the unit length of a line's x length and y length,
	 * then the unit * x length / y length many times to draw a line.
	 * @param g -the graphic used to draw a line
	 */
	public void drawLine(Graphics g) {
		 Point3f p = new Point3f(0,0,0);
		 float x = End.x - Start.x;
		 float y = End.y - Start.y;
		 
		 for(float t = 0; t <= 1.0; t += 0.001) {
			 p.x = Start.x + x * t;
			 p.y = Start.y + y * t;
			 setPixel(g, (int) p.x, (int) p.y);
		 }
	}

	// I have implemented this method to adapt Swings coordinate system
	public void setPixel(Graphics g, int x, int y) {
		
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// centre 0,0 at centre of the
											// screen for swing :-)

	}
}
