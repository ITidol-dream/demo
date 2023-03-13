package entity;

import lombok.ToString;

import java.util.List;

@ToString
public class Student {
    Teacher teacher;
    String name;
    List<String> list;

    public void init(){
        System.out.println("我是初始化");
    }
    public void destory(){
        System.out.println("我被销毁了");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(Teacher teacher) {

        this.teacher = teacher;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
