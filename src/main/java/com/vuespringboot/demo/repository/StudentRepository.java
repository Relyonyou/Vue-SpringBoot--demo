package com.vuespringboot.demo.repository;

import com.vuespringboot.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Cody
 * @date 2020/7/17 - 13:40
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
