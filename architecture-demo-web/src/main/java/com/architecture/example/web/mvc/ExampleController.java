package com.architecture.example.web.mvc;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExampleController {
	
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printWelcome(Model model) {
        model.addAttribute("message", "Spring3 MVC 测试");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "hello";
    }
}
