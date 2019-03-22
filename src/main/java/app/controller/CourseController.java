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

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("courses", service.getAllCourses());
        return "/index";
    }

    @GetMapping("/course")
    public String courses(@RequestParam(name = "id") int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", service.getCourseById(id).getName());
        model.addAttribute("desc", service.getCourseById(id).getDescription());
        return "/course";
    }
}
