package com.ravi.learnspringboot;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return "index";
    }

    @RequestMapping("/next")
    public String next(Map<String, Object> model) {
        model.put("message", "You are in new page !!");
        return "next";
    }

    @RequestMapping("/getForm")
    public String getForm(Map<String, Object> model) {
        return "empForm";
    }

    @PostMapping("/saveDetails")
    public String saveDetails(@RequestParam("employeeName") String employeeName,
                              @RequestParam("employeeEmail") String employeeEmail,
                              ModelMap modelMap) {

        // write your code to save details
        modelMap.put("employeeName", employeeName);
        modelMap.put("employeeEmail", employeeEmail);
        return "viewDetails";           // welcome is view name. It will call welcome.jsp
    }

}
