package lt.bit.bandomasisWeb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/test")
//public class TestController {
//
// @GetMapping public String index() { return "Spring Boot Web veikia!"; }


@RestController
public class TestController {

     @RequestMapping("/test")
     public String index() { return "Spring Boot Web veikia!"; }

}


