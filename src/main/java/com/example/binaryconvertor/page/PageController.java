package com.example.binaryconvertor.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "binaryPage";
    }

    @GetMapping("/data")
    public String showData() {
        return "dataPage";
    }

    @GetMapping("/length")
    public String showLength() {
        return "lengthPage";
    }



} // page controller