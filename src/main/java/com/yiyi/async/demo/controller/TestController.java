package com.yiyi.async.demo.controller;

import com.yiyi.async.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class TestController {
    Logger log = Logger.getAnonymousLogger();

    private final PeopleService peopleService;

    public TestController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("/test")
    public ResponseEntity getTest() {
        log.info(Thread.currentThread().getName() + "in controller");
        peopleService.asyncTask();

        return ResponseEntity.ok().build();
    }

}
