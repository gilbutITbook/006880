﻿package com.devchronicles.singleton;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.logging.Logger;

@Startup
@Singleton
public class MyLoggingBean {

    private Logger logger;

    @PostConstruct
    public void start() {
        logger = Logger.getLogger("MyGlobalLogger");
        logger.info("음, 내가 먼저 시작합니다!!!");
    }

    public void logInfo(String msg) {
        logger.info(msg);
    }
}
