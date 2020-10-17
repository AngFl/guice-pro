package club.example.guice;

import club.example.guice.demo.ApplicationApplet;
import club.example.guice.demo.configuare.PrinterConfiguration;

public class Application {
    /**
     * bootstrap
     * parse command line
     * set up environment
     * kick off main logic
     * @param args String[]
     */
    public static void main(String[] args) {
        ApplicationApplet applicationApplet = PrinterConfiguration.getMainApplet();
        applicationApplet.run();
    }
}
