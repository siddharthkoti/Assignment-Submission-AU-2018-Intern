package com.abstractFactory;

public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or
     * environment variables.
     */
    private static Application configureApplication() {
        Application app;
        Sportsfactory factory;
        //take MRF for example
        String sportsName = "MRF".toLowerCase();
        if (sportsName.contains("mrf")) {
            factory = new MRFFactory();
            app = new Application(factory);
        } else {
            factory = new ReebokFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}