package com.lbs.studentmanagementapp.service.IMPL;

import com.lbs.studentmanagementapp.dto.CourseDTO;
import com.lbs.studentmanagementapp.dto.CourseSaveDTO;
import com.lbs.studentmanagementapp.dto.CourseUpdateDTO;
import com.lbs.studentmanagementapp.entity.Course;
import com.lbs.studentmanagementapp.repo.CourseRepo;
import com.lbs.studentmanagementapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceIMPL implements CourseService {


    @Autowired
    private CourseRepo courseRepo;

    @Override
    public String addCourse(CourseSaveDTO courseSaveDTO) {

        Course course = new Course(
                courseSaveDTO.getCoursename(),
                courseSaveDTO.getSyllabus(),
                courseSaveDTO.getDuration()
        );
        courseRepo.save(course);
        return course.getCoursename();
    }

    @Override
    public List<CourseDTO> getAllCourses()
    {
        List<Course> getCourses = courseRepo.findAll();
        List<CourseDTO> courseDTOList = new ArrayList<>();
        for(Course course:getCourses)
        {
            CourseDTO courseDTO = new CourseDTO(
                    course.getCourseid(),
                    course.getCoursename(),
                    course.getSyllabus(),
                    course.getDuration()
            );
            courseDTOList.add(courseDTO);
        }
        return courseDTOList;
    }

    @Override
    public String updateCourse(CourseUpdateDTO courseUpdateDTO) {
        if(courseRepo.existsById(courseUpdateDTO.getCourseid()))
        {
            Course course = courseRepo.getById(courseUpdateDTO.getCourseid());
            course.setCoursename(courseUpdateDTO.getCoursename());
            course.setSyllabus(courseUpdateDTO.getSyllabus());
            course.setDuration(courseUpdateDTO.getDuration());

            courseRepo.save(course);
            return course.getCoursename();
        }
        else
        {
            System.out.println("Course ID Not Found");
        }
        return null;
    }

    @Override
    public boolean deleteCourse(int id) {

        if(courseRepo.existsById(id))
        {
            courseRepo.deleteById(id);
        }
        else
        {
            System.out.println("Course ID Not Found");
        }
        return false;
    }


}