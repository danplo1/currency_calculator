package danielp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/hello")
public class HelloWorldController {

    @RequestMapping(value = "/hello/world", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String helloName(@PathVariable(value = "name") String name) {
        return "Hello" + name;
    }
    @RequestMapping(value= "/hello", method = RequestMethod.GET)
    public String hello (@RequestParam(value = "name") String name){
        return "Hello" + name;
    }

}

