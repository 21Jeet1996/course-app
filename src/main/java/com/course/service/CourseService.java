package com.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.entity.Course;
import com.course.repository.CourseRepo;

@Service
public class CourseService {

	@Autowired
	private CourseRepo courseRepo;

	public Course createCourse(Course course) {
		return courseRepo.save(course);
	}

	public List<Course> getCourse() {
		return courseRepo.findAll();
	}

	public Optional<Course> getCourse(long id) {
		// TODO Auto-generated method stub
		return courseRepo.findById(id);
	}

	public void deleteCourse(long id) {
		courseRepo.deleteById(id);
	}

	public Course updateCourse(long id, Course course) {
		Course c = new Course();
		c.setId(id);
		c.setTitle(course.getTitle());
		c.setDiscription(course.getDiscription());

		return courseRepo.save(c);
	}

}
