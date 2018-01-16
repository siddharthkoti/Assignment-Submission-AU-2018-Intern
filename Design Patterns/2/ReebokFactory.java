package com.abstractFactory;

public class ReebokFactory implements Sportsfactory{
    @Override
    public Bat createBat() {
        return new ReebokBat();
    }

    @Override
    public Ball createBall() {
        return new ReebokBall();
    }
}


