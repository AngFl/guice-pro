package club.example.guice.serve;

import com.google.inject.Provider;

import javax.inject.Inject;
import java.util.List;

public class SessionManager {
    // 服务初始化时，获取sessionId, sessionId 不会更变
    // private final Long sessionId;
    // 获取时载入 适合 lazyLoading 实例
    private final Provider<Long> sessionIdProvider;

    private final Provider<List<String>> commandLineArgsProvider;

    @Inject
    public SessionManager(Provider<Long> sessionIdProvider, Provider<List<String>> commandLineArgsProvider) {
        this.sessionIdProvider = sessionIdProvider;
        this.commandLineArgsProvider = commandLineArgsProvider;
    }

    public Long getSessionId() {
        return sessionIdProvider.get();
    }

    public List<String> getSupportedCommandLineArgs() {
        return commandLineArgsProvider.get();
    }
}
