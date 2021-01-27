import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GraphicsObjects.Point3f;
import GraphicsObjects.Vector3f;
import Line_Algorithms.ExplicitLine;
import Line_Algorithms.ImplicitLine;
import Line_Algorithms.ParametricLine;
import Triangle_Algorithms.ParametricTriangle;
import Triangle_Algorithms.ParametricTriangle_SingleColor;

/*
 * 
 * This class to test your work and for you to make lines to draw your house , it will not compile till all the methods are complete in the other classes 
 * 
 */
public class Drawing2D extends JPanel {

	public Drawing2D() // set up graphics window
	{
		setBackground(Color.decode("#00F5FF"));

	}

	public void paintComponent(Graphics g) // draw graphics in the panel
	{
		int width = getWidth(); // width of window in pixels
		int height = getHeight(); // height of window in pixels

		// as swing starts at 0 , 0 , will need to modify drawing

		super.paintComponent(g); // call superclass to make panel display
									// correctly

		g.setColor(Color.BLACK);
		
		//line test code 
		
		//ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		//ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
		//ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		
		//FirstLine.drawLine(g);
		//SecondLine.drawLine(g);
		//ThirdLine.drawLine(g);
		
		// Remove the comments for Explicit line and test it ,
		
//		ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//		ExplicitLine SecondLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
//		ExplicitLine ThirdLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//		ExplicitLine FourthLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));
//
//		FirstLine.drawLine(g);
//		SecondLine.drawLine(g);
//		ThirdLine.drawLine(g);
//		FourthLine.drawLine(g);

		// */

		// Remove the comments for Implicit line and test it
		
//		ImplicitLine FirstLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//		ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
//		ImplicitLine ThirdLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//		ImplicitLine FourthLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));
//
//		FirstLine.drawLine(g);
//		SecondLine.drawLine(g);
//		ThirdLine.drawLine(g);
//		FourthLine.drawLine(g); 
		
		
		// Remove the comments for Parametric line and test it
		
//		ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
//		ParametricLine SecondLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
//		ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
//		ParametricLine FourthLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));
//
//		FirstLine.drawLine(g);
//		SecondLine.drawLine(g);
//		ThirdLine.drawLine(g);
//		FourthLine.drawLine(g);


		// Remove the comments for an example of square using Parametric lines
		/*
		ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(0, 300, 0));
		ParametricLine SecondLine = new ParametricLine(new Point3f(0, 300, 0), new Point3f(300, 300, 0));
		ParametricLine ThirdLine = new ParametricLine(new Point3f(300, 300, 0), new Point3f(300, 0, 0));
		ParametricLine FourthLine = new ParametricLine(new Point3f(300, 0, 0), new Point3f(0, 0, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);
		
		*/
		
//		ParametricTriangle MyFirstTriangle = new ParametricTriangle(new Point3f(200, 0, 0), new Point3f(400,200, 0),
//				new Point3f(200, 400, 0));
//
//		 MyFirstTriangle.drawTriangle(g);
//		
//		ParametricLine L1 = new ParametricLine(new Point3f(-500, 0, 0), new Point3f(500, 0, 0));
//		L1.drawLine(g);
		//insert your house drawings  here
		
		ParametricTriangle_SingleColor sd1 = new ParametricTriangle_SingleColor(new Point3f(200, 50, 0), new Point3f(450, -75, 0), new Point3f(200, -250, 0));
		sd1.drawTriangle(g, 0.3, 0.3, 0.3);
		
		ParametricTriangle_SingleColor hr1 = new ParametricTriangle_SingleColor(new Point3f(-300, 15, 0), new Point3f(200, -235, 0), new Point3f(200, -250, 0));
		ParametricTriangle_SingleColor hr2 = new ParametricTriangle_SingleColor(new Point3f(-300, 15, 0), new Point3f(-300, 0, 0), new Point3f(200, -250, 0));
		ParametricTriangle_SingleColor hr3 = new ParametricTriangle_SingleColor(new Point3f(350, -85, 0), new Point3f(350, -100, 0), new Point3f(200, -250, 0));
		ParametricTriangle_SingleColor hr4 = new ParametricTriangle_SingleColor(new Point3f(350, -85, 0), new Point3f(200, -235, 0), new Point3f(200, -250, 0));
		ParametricTriangle_SingleColor hr5 = new ParametricTriangle_SingleColor(new Point3f(-300, 15, 0), new Point3f(200, -235, 0), new Point3f(200, -220, 0));
		ParametricTriangle_SingleColor hr6 = new ParametricTriangle_SingleColor(new Point3f(-300, 15, 0), new Point3f(-285, 23, 0), new Point3f(200, -220, 0));
		ParametricTriangle_SingleColor hr7 = new ParametricTriangle_SingleColor(new Point3f(200, -220, 0), new Point3f(200, -235, 0), new Point3f(350, -85, 0));
		ParametricTriangle_SingleColor hr8 = new ParametricTriangle_SingleColor(new Point3f(200, -220, 0), new Point3f(342, -78, 0), new Point3f(350, -85, 0));
		hr1.drawTriangle(g, 0.77, 0.77, 0.77);
		hr2.drawTriangle(g, 0.77, 0.77, 0.77);
		hr3.drawTriangle(g, 0.56, 0.56, 0.56);
		hr4.drawTriangle(g, 0.56, 0.56, 0.56);
		hr5.drawTriangle(g, 0.82, 0.82, 0.82);
		hr6.drawTriangle(g, 0.82, 0.82, 0.82);
		hr7.drawTriangle(g, 0.68, 0.68, 0.68);
		hr8.drawTriangle(g, 0.68, 0.68, 0.68);
		
		ParametricTriangle_SingleColor h1 = new ParametricTriangle_SingleColor(new Point3f(-285, 23, 0), new Point3f(200, -220, 0), new Point3f(200, 80, 0));
		ParametricTriangle_SingleColor h2 = new ParametricTriangle_SingleColor(new Point3f(-285, 23, 0), new Point3f(-285, 323, 0), new Point3f(200, 80, 0));
		ParametricTriangle_SingleColor h3 = new ParametricTriangle_SingleColor(new Point3f(342, -78, 0), new Point3f(200, -220, 0), new Point3f(200, 80, 0));
		ParametricTriangle_SingleColor h4 = new ParametricTriangle_SingleColor(new Point3f(342, -78, 0), new Point3f(342, 222, 0), new Point3f(200, 80, 0));
		h1.drawTriangle(g, 0.98, 0.94, 0.9);
		h2.drawTriangle(g, 0.98, 0.94, 0.9);
		h3.drawTriangle(g, 0.8, 0.76, 0.72);
		h4.drawTriangle(g, 0.8, 0.76, 0.72);
		
		ParametricTriangle_SingleColor hf1 = new ParametricTriangle_SingleColor(new Point3f(-295, 318, 0), new Point3f(200, 70, 0), new Point3f(200, 90, 0));
		ParametricTriangle_SingleColor hf2 = new ParametricTriangle_SingleColor(new Point3f(-295, 318, 0), new Point3f(-295, 338, 0), new Point3f(200, 90, 0));
		ParametricTriangle_SingleColor hf3 = new ParametricTriangle_SingleColor(new Point3f(200, 70, 0), new Point3f(200, 90, 0), new Point3f(350, 240, 0));
		ParametricTriangle_SingleColor hf4 = new ParametricTriangle_SingleColor(new Point3f(200, 70, 0), new Point3f(350, 220, 0), new Point3f(350, 240, 0));
		ParametricTriangle_SingleColor hf5 = new ParametricTriangle_SingleColor(new Point3f(-295, 338, 0), new Point3f(200, 90, 0), new Point3f(200, 105, 0));
		ParametricTriangle_SingleColor hf6 = new ParametricTriangle_SingleColor(new Point3f(-295, 338, 0), new Point3f(-285, 348, 0), new Point3f(200, 105, 0));
		ParametricTriangle_SingleColor hf7 = new ParametricTriangle_SingleColor(new Point3f(350, 240, 0), new Point3f(200, 90, 0), new Point3f(200, 105, 0));
		ParametricTriangle_SingleColor hf8 = new ParametricTriangle_SingleColor(new Point3f(350, 240, 0), new Point3f(342, 247, 0), new Point3f(200, 105, 0));
		ParametricTriangle_SingleColor hft1 = new ParametricTriangle_SingleColor(new Point3f(-285, 348, 0), new Point3f(-143, 490, 0), new Point3f(-143, 480, 0));
		ParametricTriangle_SingleColor hft2 = new ParametricTriangle_SingleColor(new Point3f(-285, 348, 0), new Point3f(-285, 338, 0), new Point3f(-143, 480, 0));
		ParametricTriangle_SingleColor hft3 = new ParametricTriangle_SingleColor(new Point3f(-143, 490, 0), new Point3f(342, 247, 0), new Point3f(342, 237, 0));
		ParametricTriangle_SingleColor hft4 = new ParametricTriangle_SingleColor(new Point3f(-143, 490, 0), new Point3f(-143, 480, 0), new Point3f(342, 237, 0));
		ParametricTriangle_SingleColor hft5 = new ParametricTriangle_SingleColor(new Point3f(-143, 480, 0), new Point3f(342, 237, 0), new Point3f(200, 105, 0));
		ParametricTriangle_SingleColor hft6 = new ParametricTriangle_SingleColor(new Point3f(-143, 480, 0), new Point3f(-285, 338, 0), new Point3f(200, 105, 0));
		hft1.drawTriangle(g, 0.78, 0.78, 0.78);
		hft2.drawTriangle(g, 0.78, 0.78, 0.78);
		hft3.drawTriangle(g, 0.7, 0.7, 0.7);
		hft4.drawTriangle(g, 0.7, 0.7, 0.7);
		hft5.drawTriangle(g, 0.96, 0.96, 0.86);
		hft6.drawTriangle(g, 0.96, 0.96, 0.86);
		hf1.drawTriangle(g, 0.8, 0.8, 0.8);
		hf2.drawTriangle(g, 0.8, 0.8, 0.8);
		hf3.drawTriangle(g, 0.68, 0.68, 0.68);
		hf4.drawTriangle(g, 0.68, 0.68, 0.68);
		hf5.drawTriangle(g, 0.84, 0.84, 0.84);
		hf6.drawTriangle(g, 0.84, 0.84, 0.84);
		hf7.drawTriangle(g, 0.76, 0.76, 0.76);
		hf8.drawTriangle(g, 0.76, 0.76, 0.76);
		
		
		ParametricTriangle_SingleColor dr1 = new ParametricTriangle_SingleColor(new Point3f(-240, 0, 0), new Point3f(-240, 150, 0), new Point3f(-140, 100, 0));
		ParametricTriangle_SingleColor dr2 = new ParametricTriangle_SingleColor(new Point3f(-240, 0, 0), new Point3f(-140, -50, 0), new Point3f(-140, 100, 0));
		ParametricTriangle_SingleColor dr3 = new ParametricTriangle_SingleColor(new Point3f(-260, 220, 0), new Point3f(-120, 150, 0), new Point3f(-180, 80, 0));
		ParametricTriangle_SingleColor dr4 = new ParametricTriangle_SingleColor(new Point3f(-260, 220, 0), new Point3f(-320, 150, 0), new Point3f(-180, 80, 0));
		ParametricTriangle_SingleColor dr5 = new ParametricTriangle_SingleColor(new Point3f(-120, 100, 0), new Point3f(-120, 150, 0), new Point3f(-180, 80, 0));
		ParametricTriangle_SingleColor drs1 = new ParametricTriangle_SingleColor(new Point3f(-205, 125, 0), new Point3f(-205, -25, 0), new Point3f(-185, -35, 0));
		ParametricTriangle_SingleColor drs2 = new ParametricTriangle_SingleColor(new Point3f(-205, 125, 0), new Point3f(-185, 115, 0), new Point3f(-185, -35, 0));
		ParametricTriangle_SingleColor drs3 = new ParametricTriangle_SingleColor(new Point3f(-180, 120, 0), new Point3f(-185, 115, 0), new Point3f(-185, -35, 0));
		ParametricTriangle_SingleColor drs4 = new ParametricTriangle_SingleColor(new Point3f(-180, 120, 0), new Point3f(-180, -30, 0), new Point3f(-185, -35, 0));
		ParametricTriangle_SingleColor drs5 = new ParametricTriangle_SingleColor(new Point3f(-255, 150, 0), new Point3f(-255, 0, 0), new Point3f(-245, -5, 0));
		ParametricTriangle_SingleColor drs6 = new ParametricTriangle_SingleColor(new Point3f(-255, 150, 0), new Point3f(-245, 145, 0), new Point3f(-245, -5, 0));
		ParametricTriangle_SingleColor drs7 = new ParametricTriangle_SingleColor(new Point3f(-245, 145, 0), new Point3f(-245, -5, 0), new Point3f(-240, 0, 0));
		ParametricTriangle_SingleColor drs8 = new ParametricTriangle_SingleColor(new Point3f(-245, 145, 0), new Point3f(-240, 150, 0), new Point3f(-240, 0, 0));
		ParametricTriangle_SingleColor drs9 = new ParametricTriangle_SingleColor(new Point3f(-145, 95, 0), new Point3f(-145, -55, 0), new Point3f(-135, -60, 0));
		ParametricTriangle_SingleColor drs10 = new ParametricTriangle_SingleColor(new Point3f(-145, 95, 0), new Point3f(-135, 90, 0), new Point3f(-135, -60, 0));
		ParametricTriangle_SingleColor drs11 = new ParametricTriangle_SingleColor(new Point3f(-135, 90, 0), new Point3f(-135, -60, 0), new Point3f(-130, -55, 0));
		ParametricTriangle_SingleColor drs12 = new ParametricTriangle_SingleColor(new Point3f(-135, 90, 0), new Point3f(-130, 95, 0), new Point3f(-130, -55, 0));
		dr1.drawTriangle(g, 0.6, 0.96, 1);
		dr2.drawTriangle(g, 0.6, 0.96, 1);
		drs1.drawTriangle(g, 1, 1, 0);
		drs2.drawTriangle(g, 1, 1, 0);
		drs3.drawTriangle(g, 0.85, 0.85, 0);
		drs4.drawTriangle(g, 0.85, 0.85, 0);
		drs5.drawTriangle(g, 1, 1, 0);
		drs6.drawTriangle(g, 1, 1, 0);
		drs7.drawTriangle(g, 0.85, 0.85, 0);
		drs8.drawTriangle(g, 0.85, 0.85, 0);
		drs9.drawTriangle(g, 1, 1, 0);
		drs10.drawTriangle(g, 1, 1, 0);
		drs11.drawTriangle(g, 0.85, 0.85, 0);
		drs12.drawTriangle(g, 0.85, 0.85, 0);
		
		dr3.drawTriangle(g, 0.11, 0.56, 1);
		dr4.drawTriangle(g, 0.11, 0.56, 1);
		dr5.drawTriangle(g, 0.03, 0.48, 0.92);
		
		ParametricTriangle_SingleColor win1 = new ParametricTriangle_SingleColor(new Point3f(-90, -25, 0), new Point3f(150, -145, 0), new Point3f(150, -45, 0));
		ParametricTriangle_SingleColor win2 = new ParametricTriangle_SingleColor(new Point3f(-90, -25, 0), new Point3f(-90, 75, 0), new Point3f(150, -45, 0));
		ParametricTriangle_SingleColor win3 = new ParametricTriangle_SingleColor(new Point3f(-100, 90, 0), new Point3f(160, -40, 0), new Point3f(160, -50, 0));
		ParametricTriangle_SingleColor win4 = new ParametricTriangle_SingleColor(new Point3f(-100, 90, 0), new Point3f(-100, 80, 0), new Point3f(160, -50, 0));
		ParametricTriangle_SingleColor win5 = new ParametricTriangle_SingleColor(new Point3f(-100, -20, 0), new Point3f(160, -150, 0), new Point3f(160, -160, 0));
		ParametricTriangle_SingleColor win6 = new ParametricTriangle_SingleColor(new Point3f(-100, -20, 0), new Point3f(-100, -30, 0), new Point3f(160, -160, 0));
		ParametricTriangle_SingleColor win7 = new ParametricTriangle_SingleColor(new Point3f(-100, 80, 0), new Point3f(-90, 75, 0), new Point3f(-90, -25, 0));
		ParametricTriangle_SingleColor win8 = new ParametricTriangle_SingleColor(new Point3f(-100, 80, 0), new Point3f(-100, -20, 0), new Point3f(-90, -25, 0));
		ParametricTriangle_SingleColor win9 = new ParametricTriangle_SingleColor(new Point3f(150, -45, 0), new Point3f(150, -145, 0), new Point3f(160, -150, 0));
		ParametricTriangle_SingleColor win10 = new ParametricTriangle_SingleColor(new Point3f(150, -45, 0), new Point3f(160, -50, 0), new Point3f(160, -150, 0));
		ParametricTriangle_SingleColor wins1 = new ParametricTriangle_SingleColor(new Point3f(-90, 75, 0), new Point3f(-90, -25, 0), new Point3f(-85, -20, 0));
		ParametricTriangle_SingleColor wins2 = new ParametricTriangle_SingleColor(new Point3f(-90, 75, 0), new Point3f(-85, 80, 0), new Point3f(-85, -20, 0));		
		ParametricTriangle_SingleColor wins3 = new ParametricTriangle_SingleColor(new Point3f(-85, -20, 0), new Point3f(155, -140, 0), new Point3f(150, -145, 0));
		ParametricTriangle_SingleColor wins4 = new ParametricTriangle_SingleColor(new Point3f(-85, -20, 0), new Point3f(-90, -25, 0), new Point3f(150, -145, 0));
		win1.drawTriangle(g, 0.6, 0.96, 1);
		win2.drawTriangle(g, 0.6, 0.96, 1);
		wins1.drawTriangle(g, 0.8, 0.8, 0);
		wins2.drawTriangle(g, 0.8, 0.8, 0);
		win3.drawTriangle(g, 1, 1, 0);
		win4.drawTriangle(g, 1, 1, 0);
		win5.drawTriangle(g, 1, 1, 0);
		win6.drawTriangle(g, 1, 1, 0);
		win7.drawTriangle(g, 1, 1, 0);
		wins3.drawTriangle(g, 0.8, 0.8, 0);
		wins4.drawTriangle(g, 0.8, 0.8, 0);
		
		win8.drawTriangle(g, 1, 1, 0);
		win9.drawTriangle(g, 1, 1, 0);
		win10.drawTriangle(g, 1, 1, 0);
	}

	public static void main(String[] args) {
		Drawing2D panel = new Drawing2D();
		JFrame ScreenToDrawOn = new JFrame();
		ScreenToDrawOn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ScreenToDrawOn.setTitle("2D Drawing Application");
		ScreenToDrawOn.setSize(1000, 1000); // window is 500 pixels wide, 400
											// high
		ScreenToDrawOn.setVisible(true);
		ScreenToDrawOn.add(panel);
		
//		Point3f v1 = new Point3f(1,-1,0);
//		Point3f v2 = new Point3f(0,1,0);
//		Point3f v3 = new Point3f(1,1,0);
//		ImplicitLine i = new ImplicitLine(v1, v2);
//		float d = i.Distance(v3, v1, v2);
//		System.out.print(d);
		
	}

}
