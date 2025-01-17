package com.lousland.louslandspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AboutController {
    @GetMapping("/about")
    public String index(@RequestParam(value="name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "about";
    }
}
