package entity;
import lombok.ToString;

public class ArtTeacher implements Teacher{

    String  name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ArtTeacher{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void teach() {

    }
}
