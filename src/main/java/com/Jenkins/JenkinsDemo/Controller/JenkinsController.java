package com.Jenkins.JenkinsDemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {

    @RequestMapping("/hello")
    public String helloJenkins() {
        return "Hello, Jenkins! Your Jenkins setup is successful. Docker";
    }
}
