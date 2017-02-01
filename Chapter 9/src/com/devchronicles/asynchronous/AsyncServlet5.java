package com.devchronicles.asynchronous;

import java.io.*;
import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/async", asyncSupported = true)
public class AsyncServlet5 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Resource
    private ManagedExecutorService executor;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        final AsyncContext asyncContext = req.startAsync();
        final PrintWriter writer = res.getWriter();
        executor.submit(new Runnable() {
            @Override
            public void run() {
                writer.println("완료!");
                asyncContext.complete();
            }
        });
    }
}