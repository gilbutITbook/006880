package com.devchronicles.singleton;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@DependsOn("MyLoggingBean")
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@Singleton
public class CacheSingletonBean12 {

    private Map<Integer, String> myCache;

    @EJB
    MyLoggingBean loggingBean;

    @PostConstruct
    public void start() {
        loggingBean.logInfo("시작합니다!");
        myCache = new HashMap<Integer, String>();
    }

    @Lock(LockType.WRITE)
    public void addUser(Integer id, String name) {
        myCache.put(id, name);
    }

    @Lock(LockType.READ)
    public String getName(Integer id) {
        return myCache.get(id);
    }
}
