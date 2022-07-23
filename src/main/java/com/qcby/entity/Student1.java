package com.qcby.entity;

/**
 * @author wangkx
 */
public class Student1 {
    private Integer id;
    private String sName;
    private String sex;
    private Integer age;
    private Integer t_id;
    // 一个学生对应一个老师
    private Teacher1 teacher;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Teacher1 getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher1 teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sName='" + sName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", t_id=" + t_id +
                ", teacher=" + teacher +
                '}';
    }
}
