package club.example.guice.command.module;

import club.example.guice.command.annotation.CommandArg;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import java.util.Arrays;
import java.util.List;

public class CommandLineModule extends AbstractModule {

    private final String[] arguments;

    public CommandLineModule(String[] arguments) {
        super();
        this.arguments = arguments;
    }

    @Override
    protected void configure() {

    }

    @Provides
    @CommandArg
    public List<String> getCommandLineArgs() {
        return Arrays.asList(arguments);
    }
}
