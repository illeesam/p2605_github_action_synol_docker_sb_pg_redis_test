package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(@RequestParam(required = false) String api_url, Model model) {
        model.addAttribute("apiUrl", api_url);
        return "index";
    }

    @GetMapping("/echo")
    public String echo() {
        return "echo";
    }

    @GetMapping("/db-test")
    public String dbTest() {
        return "db-test";
    }

    @GetMapping("/postgresql-test")
    public String postgresqlTest() {
        return "postgresql-test";
    }

    @GetMapping("/mysql-test")
    public String mysqlTest() {
        return "mysql-test";
    }
}
