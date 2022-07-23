package com.qcby.entity;

import java.util.List;

/**
 * @author wangkx
 */
public class Teacher2 {
    private Integer id;
    private String tName;
    // 一个老师对应多个学生
    private List<Student2> student2s;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public List<Student2> getStudent2s() {
        return student2s;
    }

    public void setStudent2s(List<Student2> student2s) {
        this.student2s = student2s;
    }

    @Override
    public String toString() {
        return "Teacher2{" +
                "id=" + id +
                ", tName='" + tName + '\'' +
                ", student2s=" + student2s +
                '}';
    }
}
