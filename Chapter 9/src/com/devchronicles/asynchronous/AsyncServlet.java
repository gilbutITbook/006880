package com.devchronicles.asynchronous;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = { "/async" }, asyncSupported = true)
public class AsyncServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        final AsyncContext asyncContext = req.startAsync();
        final String data = null;
        asyncContext.addListener(new AsyncListener() {
            @Override
            public void onComplete(AsyncEvent event) throws IOException {
                AsyncContext asyncContext = event.getAsyncContext();
                asyncContext.getResponse().getWriter().println(data);
            }

            @Override
            public void onTimeout(AsyncEvent event) throws IOException {
                // 코드 생략
            }

            @Override
            public void onError(AsyncEvent event) throws IOException {
                // 코드 생략
            }

            @Override
            public void onStartAsync(AsyncEvent event) throws IOException {
                // 코드 생략
            }
        });
        new Thread() {
            @Override
            public void run() {
                asyncContext.complete();
            }
        }.start();
        res.getWriter().write("Results:");
        // DB에서 데이터를 읽어옵니다.
        data = "쿼리한 데이터...";
        // 잠시 잠듭니다.
    }
}