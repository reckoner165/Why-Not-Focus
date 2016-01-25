import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class glitch1 extends PApplet {

PImage p0,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16;
PImage [] picArray = new PImage[17];

int l=90000;
int p=90000;

  
int lastMouseX = mouseX, lastMouseY = mouseY;
PGraphics pg;
 
public void setup(){
  pg = createGraphics(width, height);
  pg.beginDraw();
  pg.background(255);
  pg.endDraw();
  
  
  size(900,600);
  imageMode(CENTER);
  p0 = loadImage("0.jpeg");
  p1 = loadImage("1.jpg");
  p2 = loadImage("2.jpeg");
  p3 = loadImage("3.jpeg");
  p4 = loadImage("4.png");
  p5 = loadImage("5.jpeg");
  p6 = loadImage("6.jpeg");
  p7 = loadImage("7.jpeg");
  p8 = loadImage("8.jpg");
  p9 = loadImage("9.jpg");
  p10 = loadImage("10.jpeg");
  p11 = loadImage("11.gif");
  p12 = loadImage("12.jpg");
  p13 = loadImage("13.jpg");
  p14 = loadImage("14.jpg");
  p15 = loadImage("15.jpg");
  p16 = loadImage("16.jpg");
  picArray[0] = p0;
  picArray[1] = p1;
  picArray[2] = p2;
  picArray[3] = p3;
  picArray[4] = p4;
  picArray[5] = p5;
  picArray[6] = p6;
  picArray[7] = p7;
  picArray[8] = p8;
  picArray[9] = p9;
  picArray[10] = p10;
  picArray[11] = p11;
  picArray[12] = p12;
  picArray[13] = p13;
  picArray[14] = p14;
  picArray[15] = p15;
  picArray[16] = p16;
  background(0);
}

public void draw(){
  background((PApplet.parseInt(random(255))),(PApplet.parseInt(random(255))),(PApplet.parseInt(random(255))));
  for(int b=0; b<60; b++){
    image(picArray[PApplet.parseInt(random(picArray.length))], random(width), random(height),40,40);
    image(picArray[PApplet.parseInt(random(picArray.length))], random(width), random(height),400,5);
    image(picArray[PApplet.parseInt(random(picArray.length))], random(width), random(height),800,5);
    image(picArray[PApplet.parseInt(random(picArray.length))], random(width), random(height),PApplet.parseInt(random(100)),PApplet.parseInt(random(200)));
    image(picArray[PApplet.parseInt(random(picArray.length))], random(width), random(height),PApplet.parseInt(random(100)),PApplet.parseInt(random(100)));
    loadPixels();
   
  }
  int r=PApplet.parseInt(random(p));
  for(int i=r;i<(r+l);i++){
    pixels[i%p]=pixels[i%p]+89000;
  }
    filter(255);
    filter(ERODE);
  noStroke();
  ellipse(mouseX,mouseY,50,50);  
}


public void mousePressed(){
  background(255);
    filter(255);
    filter(ERODE);
  noStroke();
  ellipse(mouseX,mouseY,50,50);
}


 
public void mouseMoved() {
  filter(255);
  filter(ERODE);
  noStroke();
  ellipse(mouseX,mouseY,50,50);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "glitch1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
