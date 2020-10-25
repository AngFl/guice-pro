package club.example.guice.serve;

import club.example.guice.serve.annotation.SequenceId;

import javax.inject.Inject;

public class CommandLineHandler {

    @Inject
    @SequenceId
    private String sequenceString;

    public String getSequence() {
        return sequenceString;
    }
}
