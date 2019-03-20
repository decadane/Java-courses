package app.services;

import app.DAO.CourseDAO;
import app.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDAO courseDAO;

    public List<Course> getAllCourses() {
        return courseDAO.getAllCourses();
    }

    public void addCourse(Course course) {
        courseDAO.addCourse(course);
    }

    public Course getCourse(String name) {
        return courseDAO.getCourse(name);
    }

    public String getDescription(String name) {
        return courseDAO.getDescription(name);
    }
}
