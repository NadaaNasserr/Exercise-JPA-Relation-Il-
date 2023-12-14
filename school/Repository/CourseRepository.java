package com.example.school.Repository;


import com.example.school.Medol.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {



    Course findCourseById(Integer id);




    @Query("select t.name from Teacher t, Course c where c.id=?1")
    String getTeacherName(Integer id);

}
