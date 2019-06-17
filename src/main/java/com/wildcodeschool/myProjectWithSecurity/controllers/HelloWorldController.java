package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String secret() {
        return "<ul>" +
                "	<li>La loupe" +
                "	<li>Orléans" +
                "	<li>Bordeaux" +
                "	<li>Lyon" +
                "	<li>Toulouse" +
                "	<li>Lille" +
                "	<li>Strasbourg" +
                "	<li>Paris" +
                "	<li>Reims" +
                "	<li>Biarritz" +
                "	<li>Marseille" +
                "	<li>Tours" +
                "</ul>";
    }

    @GetMapping("/jaffa")
    public String jaffa() {
        return "KRRRREEEEEEEEEEEEEEEEE";
    }
}
