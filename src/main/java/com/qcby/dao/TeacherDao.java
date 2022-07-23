package com.qcby.dao;

import com.qcby.entity.Teacher2;

import java.util.List;

public interface TeacherDao {
    List<Teacher2> getTeacherStudent();
    List<Teacher2> getTeacherStudent2();
    List<Teacher2> teacher1(Integer id);
}
