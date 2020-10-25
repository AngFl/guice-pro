package club.example.guice.serve;

import club.example.guice.serve.impl.HttpRequestHandlerImpl;
import com.google.inject.Provider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestTypeProvider implements Provider<HttpRequestHandler> {

    private final List<String> requestTypeList = new ArrayList<>(
            Arrays.asList("application/json", "application/xml"));

    @Override
    public HttpRequestHandler get() {
        return new HttpRequestHandlerImpl(requestTypeList);
    }
}
