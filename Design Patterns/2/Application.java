package com.abstractFactory;

public class Application {
	private Bat bat;
	private Ball ball;

	public Application(Sportsfactory factory) {
		bat = factory.createBat();
		ball = factory.createBall();
	}

	public void paint() {
		bat.createBat();
		ball.createBall();
	}
}
