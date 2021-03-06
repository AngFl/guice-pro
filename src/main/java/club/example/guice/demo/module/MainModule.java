package club.example.guice.demo.module;

import club.example.guice.command.annotation.CommandArg;
import club.example.guice.demo.ApplicationApplet;
import club.example.guice.demo.ApplicationDestination;
import club.example.guice.demo.PrintStringWriterDestination;
import club.example.guice.demo.StringWritingApplet;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import java.io.PrintStream;
import java.util.List;

public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ApplicationApplet.class).to(StringWritingApplet.class);
        bind(ApplicationDestination.class).to(PrintStringWriterDestination.class);
        bind(PrintStream.class).toInstance(System.out);
    }

    @Provides private String getString(@CommandArg List<String> commandArgs) {
        if (null == commandArgs || commandArgs.size() == 0) {
            return "no arguments";
        }
        return commandArgs.get(0);
    }
}
