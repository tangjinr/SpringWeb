package com.tangz.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.Writer;

@Controller
public class HelloController {

    @RequestMapping("/users/{userId}")
    public void spring(@PathVariable("userId") String userId, @RequestParam("msg") String msg,
                       @RequestHeader("host") String host, Writer writer) throws IOException {
        writer.write("userId=" + userId + ", msg=" + msg + ", hostHeader=" + host);
    }

    @RequestMapping("/users/login")
    @ResponseBody
    public String login(@RequestParam("name") String name, @RequestParam("password") String password)
            throws IOException {
        return "Name:ad " + name + "<p />Password: " + password;
    }
}
