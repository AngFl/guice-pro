package club.example.guice.demo;

import com.google.inject.Provider;

import javax.inject.Inject;

public class StringWritingApplet implements ApplicationApplet {

    private final ApplicationDestination destination;

    private final Provider<String> stringProvider;

    @Inject
    public StringWritingApplet(ApplicationDestination destination, Provider<String> stringProvider) {
        this.destination = destination;
        this.stringProvider = stringProvider;
    }

    private void print() {
        // Hello world 依赖注入核心概念： 向指定目标输出指定内容
        destination.write(stringProvider.get());
    }

    public void run() {
        print();
    }
}
