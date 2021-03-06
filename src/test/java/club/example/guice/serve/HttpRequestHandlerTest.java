package club.example.guice.serve;

import club.example.guice.serve.module.ServeModule;
import com.google.inject.Guice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

public class HttpRequestHandlerTest {

    @Inject
    private HttpRequestHandler httpRequestHandler;

    @Inject
    private CommandLineHandler commandLineHandler;

    @Before
    public void setUp() {
        Guice.createInjector(new ServeModule())
                .injectMembers(this);
    }

    @Test
    public void testSupportedHandleType() {
        boolean supported = httpRequestHandler.supported("application/xml");
        Assert.assertNotEquals(supported, false);
    }

    @Test
    public void testGetSequence() {
        String sequence = commandLineHandler.getSequence();
        System.out.println(sequence);
        Assert.assertNotNull(sequence);
    }
}
