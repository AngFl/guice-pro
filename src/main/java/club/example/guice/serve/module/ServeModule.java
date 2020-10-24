package club.example.guice.serve.module;

import club.example.guice.serve.OrderService;
import club.example.guice.serve.PaymentService;
import club.example.guice.serve.PriceService;
import club.example.guice.serve.impl.OrderServiceImpl;
import club.example.guice.serve.impl.PaymentServiceImpl;
import club.example.guice.serve.impl.PriceServiceImpl;
import com.google.inject.AbstractModule;

public class ServeModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(PriceService.class).to(PriceServiceImpl.class);
        bind(PaymentService.class).to(PaymentServiceImpl.class);
        bind(OrderService.class).to(OrderServiceImpl.class);
    }
}
