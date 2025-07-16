package com.business;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    

    @GetMapping("/")
    public String home() {
        return "home"; // returns templates/home.html
    }

  

    @GetMapping("/products")
    public String products() {
        return "products"; // returns templates/products.html
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // returns templates/about.html
    }
}
