package club.example.guice.demo.configuare;

import club.example.guice.demo.ApplicationApplet;
import club.example.guice.demo.PrintStringWriterDestination;
import club.example.guice.demo.StringWritingApplet;

public class PrinterConfiguration {

    public static ApplicationApplet getMainApplet() {
        return new StringWritingApplet(
                new PrintStringWriterDestination(System.out), () -> "Google Guice");
    }
}
