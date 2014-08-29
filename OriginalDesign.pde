void setup()
{
	background(135, 206, 250);
	size(430, 400);
	noLoop();
}

void house() 
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

void hills()
{
	noStroke();
	fill(0, 128, 0);
	triangle(0, 270, 300, 400, 0, 400);
	ellipse(350, 350, 300, 400);
}

void draw()
{
	hills();
}

void mousePressed()
{
	house();
	redraw();
}