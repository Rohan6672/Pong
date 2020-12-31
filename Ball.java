package Pong;

import apcs.Window;

public class Ball {
	public String color;
	public double radius;
	public int x;
	public int y;
	public int dx;
	public int dy;
	
	
	public Ball(){
		color="red";
		x=200;
		y=200;
		radius=50;
		dx=5;
		dy=5;
		
		
	}
	public void move(){
		x+=dx;
		y+=dy;
	}
	public void Draw(){
		Window.out.color(color);
		Window.out.circle(x,y,radius);
	}
	public void reflect(Paddle p){
		if(x+radius >=p.x - p.width/2 && x-radius<= p.x + p.width/2){
				if(y+radius >= p.y - p.height/2 && y-radius <=p.y+ p.height/2){
					dx=-dx;
				}
			
		}
		if(y+radius>= Window.height() || y-radius<=0){
			dy =-dy;
		}
		
		}
			
	}
	


	




	