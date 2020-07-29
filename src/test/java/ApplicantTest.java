import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for Applicant class")
class ApplicantTest {

    Applicant applicant;
    School school;

    @BeforeEach
    void init() {
        applicant = new Applicant("Sol", "Male", 7);
    }


    @Test
    @DisplayName("Testing getName")
    void getName() {
        String expected = "Sol";
        String actual = applicant.getName();
        assertEquals(expected, actual, "it should return " + expected);
    }

    @Test
    @DisplayName("Testing getGender")
    void getGender() {
        String expected = "Male";
        String actual = applicant.getGender();
        assertEquals(expected, actual, "it should return " + expected);
    }

    @Test
    @DisplayName("Testing getAge")
    void getAge() {
        int expected = 7;
        int actual = applicant.getAge();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing applyForAdmission")
    void applyForAdmission() {
        school = new School("Holy Angels", "Surulere", 1990);
        applicant.applyForAdmission(school);
        assertTrue(school.getApplicants().size() == 1, "Applicants array size must be equal to 1.");
    }
}