import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for Course class")
class CourseTest {

    Course course;

    @BeforeEach
    void init() {
        course = new Course("Biology", "BIO");
    }

    @Test
    @DisplayName("Testing getId")
    void getId() {
        String expected = "BIO";
        String actual = course.getId();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing getName")
    void getName() {
        String expected = "Biology";
        String actual = course.getName();
        assertEquals(expected, actual, "it should return "+expected);
    }
}
