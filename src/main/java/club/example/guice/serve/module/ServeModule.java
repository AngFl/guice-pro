package club.example.guice.serve.module;

import club.example.guice.serve.HttpRequestHandler;
import club.example.guice.serve.OrderService;
import club.example.guice.serve.PaymentService;
import club.example.guice.serve.PriceService;
import club.example.guice.serve.RequestTypeProvider;
import club.example.guice.serve.impl.OrderServiceImpl;
import club.example.guice.serve.impl.PaymentServiceImpl;
import club.example.guice.serve.impl.PriceServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class ServeModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(PriceService.class).to(PriceServiceImpl.class);
        bind(PaymentService.class).to(PaymentServiceImpl.class);
        bind(OrderService.class).to(OrderServiceImpl.class);

        // provider 绑定
        bind(HttpRequestHandler.class).toProvider(new RequestTypeProvider());
    }

    @Provides
    public Long generateSessionIdOnInit() {
        return Instant.now().getEpochSecond();
    }

    @Provides
    public String generateUUID() {
        return UUID.randomUUID().toString();
    }

    @Provides
    public List<String> getSupportedCommandLineArgs() {
        return Arrays.asList("help", "start", "stop");
    }

    @Provides
    @Named("supportedCurrencies")
    public List<String> getSupportedCurrencies() {
        return Arrays.asList("USD", "CNY", "ERP");
    }
}
