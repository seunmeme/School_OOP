import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for Teacher class")
class TeacherTest {

    Teacher teacher;
    Course course;

    @BeforeEach
    void init() {
        teacher = new Teacher("Achi", "Male", 35, new Course("Science", "SCI"));
    }

    @Test
    @DisplayName("Testing getName")
    void getName() {
        String expected = "Achi";
        String actual = teacher.getName();
        assertEquals(expected, actual, "it should return " + expected);
    }

    @Test
    @DisplayName("Testing getGender")
    void getGender() {
        String expected = "Male";
        String actual = teacher.getGender();
        assertEquals(expected, actual, "it should return " + expected);
    }

    @Test
    @DisplayName("Testing getAge")
    void getAge() {
        int expected = 35;
        int actual = teacher.getAge();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing getRole")
    void getRole() {
        String expected = "Teacher";
        String actual = teacher.getRole();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing getCourse")
    void getCourse() {
        String expected = "Science";
        String actual = teacher.getCourse().getName();

        assertEquals(expected, actual, "it should return Science.");
    }

    @Test
    @DisplayName("Testing attendClass")
    void attendClass() {
        course = new Course("Social Studies", "SOS");
        String expected = "Tutor Achi is attending class to teach Social Studies";
        String actual = teacher.attendClass(course);

        assertEquals(expected, actual, "it should return the right message.");
    }
}