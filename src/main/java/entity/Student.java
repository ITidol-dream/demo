package entity;

import lombok.ToString;

import java.util.List;

@ToString
public class Student {
    Teacher teacher;
    String name;
    List<String> list;

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {

        this.teacher = teacher;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
