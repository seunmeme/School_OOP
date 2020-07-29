import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for Student class")
class StudentTest {

    Student student;
    Course course;

    @BeforeEach
    void init() {
        student = new Student("Michael", "Male", 7);
    }

    @Test
    @DisplayName("Testing getName")
    void getName() {
        String expected = "Michael";
        String actual = student.getName();
        assertEquals(expected, actual, "it should return " + expected);
    }

    @Test
    @DisplayName("Testing getGender")
    void getGender() {
        String expected = "Male";
        String actual = student.getGender();
        assertEquals(expected, actual, "it should return " + expected);
    }

    @Test
    @DisplayName("Testing getAge")
    void getAge() {
        int expected = 7;
        int actual = student.getAge();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing getId")
    void getId() {
        student = new Student("Dare", "Male", 6);
        assertTrue(student.getId() == 1, "student id should auto increment");
    }

    @Test
    @DisplayName("Testing getCourses")
    void getCourses() {
        student = new Student("Dare", "Male", 6);
        course = new Course("Social Studies", "SOS");
        student.addCourse(course);

        assertTrue(student.getCourses()[0] == course, "student courses list should contain one course.");

    }

    @Test
    @DisplayName("Testing getNumberOfCourses")
    void getNumberOfCourses() {
        student = new Student("Dare", "Male", 6);
        course = new Course("Social Studies", "SOS");
        student.addCourse(course);

        assertTrue(student.getNumberOfCourses() == 1, "number of courses should be 1.");
    }

    @Test
    @DisplayName("Testing addCourse")
    void addCourse() {
        student = new Student("Dare", "Male", 6);
        course = new Course("Social Studies", "SOS");
        student.addCourse(course);

        assertTrue(student.getCourses()[0] != null, "course should be added to the list.");
    }


    @Test
    @DisplayName("Testing attendClass")
    void attendClass() {
        student = new Student("Dare", "Male", 6);
        course = new Course("Social Studies", "SOS");
        String expected = "Dare is attending class to learn Social Studies";
        String actual = student.attendClass(course);

        assertEquals(expected, actual, "it should return the right message.");

    }
}