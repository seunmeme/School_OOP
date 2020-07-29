import java.util.ArrayList;
import java.util.List;

public class Course {
    private String id;
    private String name;

    public Course(String name, String id) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
