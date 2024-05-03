package com.course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.course.entity.Course;
import com.course.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping(value = "/course")
	public Course createCourse(@RequestBody Course course) {
		return courseService.createCourse(course);
	}

	@GetMapping(value = "/course")
	public List<Course> getCourse() {
		return courseService.getCourse();
	}

	@GetMapping(value = "/course/{id}")
	public Optional<Course> getCourse(@PathVariable("id") long id) {
		return courseService.getCourse(id);
	}

	@DeleteMapping(value = "/course/{id}")
	public String deleteCourse(@PathVariable("id") long id) {
		courseService.deleteCourse(id);
		return "course deleted sucssefully!!";
	}

	@PutMapping(value = "/course/{id}")
	public Course updateCourse(@PathVariable("id") long id, @RequestBody Course course) {

		return courseService.updateCourse(id, course);

	}

}
