package app.DAO;

import app.model.Course;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CourseDAOImpl implements CourseDAO{

    List<Course> courses = Arrays.asList(new Course("Step 1", "Easy way to learn Java starts here!"),
                                        new Course("Step 2", "Continue for some steelass guys!"),
                                        new Course("Step 3", "More courses for course's god!!!"),
                                        new Course("Step 4", "It's time to stop, or not?"));

    public List<Course> getAllCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course getCourse(String name) {
        for (Course crs : courses) {
            if (crs.getName().equals(name))
                return crs;
        }
        return null;
    }

    @Override
    public String getDescription(String name) {
        for (Course course : getAllCourses()) {
            if (course.getName().equals(name))
                return course.getDescription();
        }
        return null;
    }
}
