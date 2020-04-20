package com.yiyi.async.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {

    @Async
    public void asyncTask() {
        System.out.println(Thread.currentThread().getName() + "in service start .......");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "in service end .......");

//        try {
//            newMethod();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @Async
    public void newMethod() throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + "in sub method .......");
        Thread.sleep(10000);
        System.out.println(Thread.currentThread().getName() + "end ......");

    }


}
