import java.util.List;

public class Student extends Person implements TakeCourse{
    private int id;
//    All students can take at most 15 courses.
    private Course[] courses = new Course[15];
    private int numberOfCourses;

    public Student(String name, String gender, int age) {
        super(name, gender, age);
        this.id++;
    }

    public int getId() {
        return id;
    }

    public Course[] getCourses() {
        return courses;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void addCourse(Course course){
        if(numberOfCourses < courses.length){
            courses[numberOfCourses] = course;
            numberOfCourses++;
        } else {
            System.out.println("Exceeded maximum courses for student");
        }

    }

    @Override
    public String attendClass(Course course) {
        return this.getName() + " is attending class to learn " + course.getName();
    }
}
