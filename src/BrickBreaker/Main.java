package BrickBreaker;

import javax.swing.*;

// Following Java Game Programming - Develop a Brick Breaker Game
// https://www.youtube.com/watch?v=K9qMm3JbOH0

public class Main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("BrickBreaker");
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
		obj.setVisible(true);
	}
}
