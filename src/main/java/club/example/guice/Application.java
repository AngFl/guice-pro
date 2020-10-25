package club.example.guice;

// import club.example.guice.demo.ApplicationApplet;
// import club.example.guice.demo.configure.PrinterConfiguration;

import club.example.guice.command.module.CommandLineModule;
import club.example.guice.demo.ApplicationApplet;
import club.example.guice.demo.module.MainModule;
import com.google.inject.Guice;

public class Application {
    /**
     * bootstrap
     * parse command line
     * set up environment
     * kick off main logic
     * @param args String[]
     */
    public static void main(String[] args) {
        // ApplicationApplet applicationApplet = PrinterConfiguration.getMainApplet();
        ApplicationApplet applicationApplet = Guice
                .createInjector(new MainModule(), new CommandLineModule(args))
                .getInstance(ApplicationApplet.class);
        applicationApplet.run();
    }
}
