package com.abstractFactory;

public class MRFFactory implements Sportsfactory{
	
	@Override
    public MRFBat createBat() {
        return new MRFBat();
    }

    @Override
    public MRFBall createBall() {
        return new MRFBall();
    }
	
}

