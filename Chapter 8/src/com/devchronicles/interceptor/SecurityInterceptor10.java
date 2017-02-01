package com.devchronicles.interceptor;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Secure
@Interceptor
public class SecurityInterceptor10 {

    @AroundInvoke
    public Object doSecurityCheck(InvocationContext context) throws Exception {
        // 보안 체크를 합니다!
        Logger.getLogger("SecurityLog").info(
                context.getMethod().getName() + "에 접근합니다!");
        String user = (String) context.getContextData().get("user");
        if (user == null) {
            user = (String) context.getParameters()[0];
            context.getContextData().put("user", user);
        }

        return context.proceed();
    }

    @PostConstruct
    public void onStart() {
        Logger.getLogger("SecurityLog").info("가동");
    }

    @PreDestroy
    public void onShutdown() {
        Logger.getLogger("SecurityLog").info("멈춤");
    }
}
