import java.util.List;

public class Teacher extends Staff implements TakeCourse{
    private Course course;

    public Teacher(String name, String gender, int age, Course course) {
        super(name, gender, age,"Teacher");
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String attendClass(Course course) {
        return "Tutor" + this.getName() + " is attending class to teach " + course.getName();
    }
}
