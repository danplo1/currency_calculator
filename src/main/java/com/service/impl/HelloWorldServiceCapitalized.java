package com.service.impl;

import com.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceCapitalized implements HelloWorldService {

public String hello(){
    return "HELLO WORLD!";
}
}
