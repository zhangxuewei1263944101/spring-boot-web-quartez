package com.example.springbootwebquartez.Impl;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello2  extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //打印当前的执行时间 例如 2017-11-23 00:00:00
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("3秒执行一次 现在的时间是："+ sf.format(date));
        //具体的业务逻辑
        System.out.println("3秒执行一次 Hello Quartz");
        System.out.println("3秒执行一次 Hello!  HelloJob is executing.");
    }
}
