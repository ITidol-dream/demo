package entity;
import lombok.ToString;
@ToString
public class ProgramTeacher implements Teacher {

    String  name;

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void teach() {

    }
}
