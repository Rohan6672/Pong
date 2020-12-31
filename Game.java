package Pong;

import apcs.Window;

public class Game {

	public static void main(String[] args) {
		Window.size(1000,1000);
		Paddle Paddle1=new Paddle();
		Ball Ball1= new Ball();
		Paddle2 Paddle2 = new Paddle2();
		 
		while(true){
			Ball1.Draw();
			Paddle1.Draw();
			Paddle2.Draw();
			Window.frame();

			Window.out.background("lightblue");
			Ball1.move();
			Paddle2.move();
			Paddle1.move();
			Ball1.reflect(Paddle1);
			
			
			
		}
		

	}

}
