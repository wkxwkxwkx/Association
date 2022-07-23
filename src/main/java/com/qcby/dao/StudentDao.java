package com.qcby.dao;

import com.qcby.entity.Student1;

import java.util.List;

/**
 * @author wangkx
 */
public interface StudentDao {
    List<Student1> selectStudentTeacher();
    List<Student1> StudentTeacher2();
    List<Student1> getStudent(Integer id);
}
