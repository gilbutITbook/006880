package com.devchronicles.timer;

import javax.annotation.Resource;
import javax.ejb.ScheduleExpression;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

public class SimpleProgramaticTimer4 {
    @Resource
    TimerService timerService;

    public void setTimer() {
        ScheduleExpression expression = new ScheduleExpression();
        expression.second("*/10").minute("*").hour("*");
        Timer timer = timerService.createCalendarTimer(new ScheduleExpression()
                .second("*/10").minute("*").hour("*"));
    }

    @Timeout
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void performTask() {
        System.out.println("단순한 작업을 실행하였습니다.");
    }
}