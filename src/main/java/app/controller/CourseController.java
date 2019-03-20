package app.controller;

import app.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("courses", service.getAllCourses());
        return "/index";
    }

    @GetMapping("/course")
    public String courses(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("desk", service.getDescription(name));
        return "/course";
    }
}
