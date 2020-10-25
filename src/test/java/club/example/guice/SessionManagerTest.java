package club.example.guice;

import club.example.guice.serve.PriceService;
import club.example.guice.serve.SessionManager;
import club.example.guice.serve.module.ServeModule;
import com.google.inject.Guice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;
import java.util.List;

public class SessionManagerTest {

    @Inject
    private SessionManager sessionManager;

    @Inject
    private PriceService priceService;

    @Before
    public void setUp() {
        Guice.createInjector(new ServeModule())
                .injectMembers(this);
    }

    @Test
    public void testGetSessionId() throws InterruptedException {
        Long sessionId = sessionManager.getSessionId();
        Thread.sleep(1000L);
        Long expiredSessionId = sessionManager.getSessionId();
        Assert.assertNotEquals(sessionId, expiredSessionId);
    }

    @Test
    public void testSupportedCommandLineArgs() {
        List<String> lineArgs = sessionManager.getSupportedCommandLineArgs();
        Assert.assertNotEquals(0, lineArgs.size());
    }

    @Test
    public void testSupportedCurrencies() {
        List<String> currencies = priceService.getSupportedCurrencies();
        Assert.assertNotEquals(0, currencies.size());
    }
}
