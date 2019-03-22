package app.DAO;

import app.model.Course;

import java.util.List;

public interface CourseDAO {

    Course getCourseById(int id);

    List<Course> getAllCourses();
}
