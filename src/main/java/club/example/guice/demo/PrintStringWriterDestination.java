package club.example.guice.demo;

import javax.inject.Inject;
import java.io.PrintStream;

public class PrintStringWriterDestination implements ApplicationDestination {

    private final PrintStream printStream;

    @Inject
    public PrintStringWriterDestination(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void write(String content) {
        printStream.println(content);
    }
}
