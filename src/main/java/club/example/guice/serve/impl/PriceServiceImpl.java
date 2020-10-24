package club.example.guice.serve.impl;

import club.example.guice.serve.PriceService;

public class PriceServiceImpl implements PriceService {

    @Override
    public long getPrice(long orderId) {
        return 1000L;
    }
}
