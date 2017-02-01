package com.devchronicles.asynchronous;

import java.io.*;
import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns="/async", asyncSupported=true)
public class AsyncServlet4 extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    
    @Resource
    private ManagedThreadFactory factory;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        final AsyncContext asyncContext = req.startAsync();
        final PrintWriter writer = res.getWriter();
        Thread thread = factory.newThread(new Runnable() {
            @Override
            public void run() {
                writer.println("완료!");
                asyncContext.complete();
            }
        });
        thread.start();
    }
}