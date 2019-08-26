package com.example.springbootwebquartez.Impl;

import org.quartz.*;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloJob  extends QuartzJobBean   {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //打印当前的执行时间
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("10秒执行一次：现在的时间是："+ sf.format(date));
        //具体的业务逻辑
        System.out.println("10秒执行一次：Hello Quartz");
        System.out.println("10秒执行一次：Hello!  HelloJob is executing.");
    }


}
