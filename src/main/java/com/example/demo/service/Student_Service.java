package com.example.demo.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.StudentModel;

@Repository
public interface Student_Service extends JpaRepository<StudentModel,Integer>  {

}
