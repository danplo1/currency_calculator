package com.danielp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.service.HelloWorldService;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
//    @Qualifier(value = "cap")
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public String helloWorld() {
        return helloWorldService.hello();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String helloName(@PathVariable(value = "name") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String helloParam(@RequestParam(
            value = "name",
            required = false,
            defaultValue = "anonymous") String name) {
        return "Hello " + name;
    }
}
