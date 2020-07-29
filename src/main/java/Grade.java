import java.util.ArrayList;
import java.util.List;

public class Grade {
    private String name;
    private List<Person> students = new ArrayList<Person>();

    public Grade(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Person> getStudents() {
        return students;
    }

}
