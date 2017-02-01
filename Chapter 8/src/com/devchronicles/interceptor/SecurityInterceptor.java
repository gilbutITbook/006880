package com.devchronicles.interceptor;

import java.util.logging.Logger;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
public class SecurityInterceptor {
    @AroundInvoke
    public Object doSecurityCheck(InvocationContext context) throws Exception {
        // 보안 체크를 합니다!
        Logger.getLogger("SecurityLog").info(
                context.getMethod().getName() + "에 접근합니다!");
        return context.proceed();
    }
}