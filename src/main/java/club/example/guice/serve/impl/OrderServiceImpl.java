package club.example.guice.serve.impl;

import club.example.guice.serve.OrderService;
import club.example.guice.serve.PaymentService;
import club.example.guice.serve.PriceService;
import club.example.guice.serve.SessionManager;

import javax.inject.Inject;

public class OrderServiceImpl implements OrderService {

    private final PaymentService paymentService;

    private final PriceService priceService;

    private final SessionManager sessionManager;

    private long ordersPaid = 0L;

    @Inject
    public OrderServiceImpl(PaymentService paymentService, PriceService priceService, SessionManager sessionManager) {
        this.paymentService = paymentService;
        this.priceService = priceService;
        this.sessionManager = sessionManager;
    }

    public void sendToPayment(long orderId) {
        long price = priceService.getPrice(orderId);
        paymentService.pay(orderId, price, sessionManager.getSessionId());
        ordersPaid = ordersPaid + 1;

        throw new RuntimeException("ordersPaid:" + ordersPaid + "\n price:"
                                   + price + "\nsessionId: " + sessionManager.getSessionId());
    }
}
