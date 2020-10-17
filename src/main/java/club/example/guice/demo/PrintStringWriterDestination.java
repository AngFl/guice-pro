package club.example.guice.demo;

import java.io.PrintStream;

public class PrintStringWriterDestination implements ApplicationDestination {

    private final PrintStream printStream;

    public PrintStringWriterDestination(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void write(String content) {
        printStream.println(content);
    }
}
