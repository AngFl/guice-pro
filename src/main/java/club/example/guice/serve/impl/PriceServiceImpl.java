package club.example.guice.serve.impl;

import club.example.guice.serve.PriceService;
import com.google.inject.name.Named;

import javax.inject.Inject;
import java.util.List;

public class PriceServiceImpl implements PriceService {

    @Inject
    @Named("supportedCurrencies")
    private List<String> supportedCurrenciesProvider;

    @Override
    public long getPrice(long orderId) {
        return 1000L;
    }

    @Override
    public List<String> getSupportedCurrencies() {
        return supportedCurrenciesProvider;
    }
}
