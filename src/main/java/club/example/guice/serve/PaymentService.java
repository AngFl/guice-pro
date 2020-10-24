package club.example.guice.serve;

public interface PaymentService {

    void pay(long orderId, long price, Long sessionId);
}
