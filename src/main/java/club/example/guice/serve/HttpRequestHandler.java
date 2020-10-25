package club.example.guice.serve;

public interface HttpRequestHandler {

    boolean supported(String requestType);
}
