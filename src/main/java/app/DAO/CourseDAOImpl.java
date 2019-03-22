package app.DAO;

import app.model.Course;
import app.util.HibernateSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDAOImpl implements CourseDAO{

    public List<Course> getAllCourses() {
        List<Course> courses = HibernateSessionFactory.getSessionFactory().openSession()
                .createQuery("FROM Course").list();
        return courses;
    }

    public Course getCourseById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(Course.class, id);
    }
}
