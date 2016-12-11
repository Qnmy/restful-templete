package com.zxj.controller;

import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zxj.domain.Greeting;
import com.zxj.mapper.TestMapper;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
   /* @Resource
    private JdbcTemplate jdbcTemplate;*/
    @Resource
    private TestMapper testMapper;
    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	System.out.println(String.format("执行结果 '%s'", testMapper.findByAge("15")));
    	//jdbcTemplate.execute("INSERT INTO student(name, age) values('spring-boot','2')");
    	return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}