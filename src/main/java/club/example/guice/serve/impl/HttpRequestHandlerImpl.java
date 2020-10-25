package club.example.guice.serve.impl;

import club.example.guice.serve.HttpRequestHandler;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

public class HttpRequestHandlerImpl implements HttpRequestHandler {

    private final List<String> requestTypeList;

    @Inject
    public HttpRequestHandlerImpl(List<String> requestTypeList) {
        this.requestTypeList = requestTypeList;
    }

    @Override
    public boolean supported(String requestType) {
        Optional<String> optional = requestTypeList.stream().filter(e -> e.equals(requestType)).findAny();
        return optional.isPresent();
    }
}
