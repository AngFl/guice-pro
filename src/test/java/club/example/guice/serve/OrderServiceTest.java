package club.example.guice.serve;

import club.example.guice.serve.module.ServeModule;
import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

public class OrderServiceTest {

    @Inject
    private OrderService orderService;

    @Before
    public void setUp() {
        Guice.createInjector(new ServeModule())
                // 对this 下面的所有的成员属性注入
                .injectMembers(this);
    }

    @Test
    public void testSendToPayment() {
        // OrderService orderService = Guice.createInjector(new ServeModule())
        //        .getInstance(OrderService.class);
        orderService.sendToPayment(10023L);
    }
}
