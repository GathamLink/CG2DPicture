package Line_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;

/**
 * This Class is used to draw a line in a ExplicitLine Form
 * @author Link
 *
 */
public class ExplicitLine {
	
	Point3f Start;
	Point3f End;
	float slope; 
	 
	public ExplicitLine(Point3f Start, Point3f End) { 
		this.Start = Start;
		this.End = End;
		slope = getSlope(); // you need to implement this before the class will compile 
	}
	
	/**
	 * this method is used to calculate the slope of a line
	 * @return the slope of this line
	 */
	public float getSlope()
	{
		 float rise = End.y - Start.y;
		 float run = End.x - Start.x;
		 float slope = rise/run;
		 return slope;
	}
	
	/**
	 * this method is used to draw lines. the algorithm of this draw method is explicit form.
	 * when draw lines, method needs to figure out whether the slope of this line is bigger than 1.
	 * because if slope > 1, the form of a line is changed to x = n * y + d which is different from y = n * x + c if slope of this line is smaller than 1.
	 * @param g the graphic used to draw the line
	 */
	public void drawLine(Graphics g)
	{
		 float x0 = Start.x;
		 float y0 = Start.y;
		 float x1 = End.x;
		 float y1 = End.y;
		 float rise = y1 - y0;
		 float run = x1 - x0;
		 float c1 = y1 - (rise/run)*x1;
		 float c2 = x1 - (run/rise)*y1;
		 int x, y;
		 
		 if(run > 0) { //x1 > x0
			 if(rise > 0) { // y1 > y0
				 if(run > rise) {
					 for(x = (int) x0; x < x1; x++) {
						 y = (int) ((rise/run) * x + c1);
						 setPixel(g, x, y);
					 }
				 }else {
					 for(y = (int) y0; y < y1; y++) {
						 x = (int) ((run/rise) * y + c2);
						 setPixel(g, x, y);
					 }
				 }
			 }else if(rise < 0){ // y1 < y0
				 if(run > -rise) {
					 for(x = (int) x0; x < x1; x++) {
						 y = (int) ((rise/run) * x + c1);
						 setPixel(g, x ,y);
					 }
				 }else {
					 for(y = (int) y1; y < y0; y++) {
						 x = (int) ((run/rise) * y + c2);
						 setPixel(g, x, y);
					 }
				 }
			 }else if (rise == 0) { // y1 == y0
				 for (x = (int) x0; x < x1; x++) {
					 setPixel(g, x, (int) y1);
				 }
			 }
		 }else if(run == 0) { // x1 == x0
			 if(rise > 0) { // y1 > y0
				 for(y = (int) y0; y < y1; y++) {
					 setPixel(g, (int) x1, y);
				 }
			 }else {
				 for(y = (int) y1; y < y0; y++) {
					 setPixel(g, (int) x1, y);
				 }
			 }
		 }else if(run < 0) { // x1 < x0
			 if(rise > 0) { // y1 > y0
				 if(-run > rise) {
					 for(x = (int) x1; x < x0; x++) {
						 y = (int) ((rise/run) * x + c1);
						 setPixel(g, x, y);
					 }
				 }
			 }
		 }
	}
	
	//I have implemented this method to adapt Swings coordinate system 
	public void setPixel(Graphics g,int x,int y)  
	{
		g.drawRect(x+500, 500-y, 1,1);  // + 500 offset is to make the centre 0,0 at centre of the screen 
		  
	}

}
