package app.DAO;

import app.model.Course;

import java.util.List;

public interface CourseDAO {

    void addCourse(Course course);

    Course getCourse(String name);

    List<Course> getAllCourses();

    String getDescription(String name);
}
