import java.util.ArrayList;
import java.util.List;

//Grade class represents Class since class is a keyword.
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
