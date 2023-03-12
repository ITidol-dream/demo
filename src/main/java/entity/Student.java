package entity;

import lombok.ToString;

@ToString
public class Student {
    Teacher teacher;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
