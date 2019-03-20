package app.services;

import app.model.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourses();

    void addCourse(Course course);

    Course getCourse(String name);

    String getDescription(String name);
}
