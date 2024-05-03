package com.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {

}
