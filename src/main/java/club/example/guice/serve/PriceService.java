package club.example.guice.serve;

import java.util.List;

public interface PriceService {

    long getPrice(long orderId);

    List<String> getSupportedCurrencies();
}
