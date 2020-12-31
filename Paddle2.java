package Pong;

import apcs.Window;

public class Paddle2 {
	public String color;
	public int x;
	public int y;
	public int width;
	public int height;
	public int dx;
	public int dy;
	
	public Paddle2(){
		color="Yellow";
		width=50;
		height=300;
		x=900;
		y=200;
		dx=5;
		dy=5;
		
		
	}
	public void move(){
		
		if(Window.key.pressed("up")){
			y-=dy;
		}
		if(Window.key.pressed("down")){
			y+=dy;
		}
	
	}
	public  void Draw(){
		Window.out.color(color);
		Window.out.rectangle(x, y, width, height);
	}


}
