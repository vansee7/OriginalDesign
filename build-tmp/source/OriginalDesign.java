import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
	background(135, 206, 250);
	size(430, 400);
	noLoop();
}

public void house() 
{
	fill(128, 128, 128);
	beginShape();
	vertex(mouseX-20, mouseY+70);
	vertex(mouseX-20, mouseY+30);
	vertex(mouseX-40, mouseY+30);
	vertex(mouseX, mouseY);
	vertex(mouseX+40, mouseY+30);
	vertex(mouseX+20, mouseY+30);
	vertex(mouseX+20, mouseY+70);
	vertex(mouseX-20, mouseY+70);
	endShape();
	noStroke();
}

public void hills()
{
	noStroke();
	fill(0, 128, 0);
	triangle(0, 270, 300, 400, 0, 400);
	ellipse(350, 350, 300, 400);
}

public void draw()
{
	hills();
}

public void mousePressed()
{
	house();
	redraw();
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
