package backend.backend.Course;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

       // Méthode pour obtenir tous les cours
       public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public List<Course> getCoursesByModuleId(Long moduleId) {
        return courseRepository.findByModuleId(moduleId);
    }

    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(Long id, Course course) {
        course.setId(id);
        return courseRepository.save(course);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}

