import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for Grade class")
class GradeTest {

    Grade grade;

    @BeforeEach
    void init() {
        grade = new Grade( "One");
    }

    @Test
    @DisplayName("Testing getName")
    void getName() {
        String expected = "One";
        String actual = grade.getName();
        assertEquals(expected, actual, "it should return " + expected);
    }

    @Test
    @DisplayName("Testing getStudents")
    void getStudents() {
        assertTrue(grade.getStudents().size() == 0, "Students array should be initially empty.");
    }
}