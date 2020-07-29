import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for School class")
class SchoolTest {

    School school;
    Staff staff;
    Applicant applicant;

    @BeforeEach
    void init() {
        school = new School("Government College", "Aguda", 1990);
    }

    @Test
    @DisplayName("Testing getName")
    void getName() {
        String expected = "Government College";
        String actual = school.getName();
        assertEquals(expected, actual, "it should return " + expected);
    }

    @Test
    @DisplayName("Testing getYearEstablished")
    void getYearEstablished() {
        int expected = 1990 ;
        int actual = school.getYearEstablished();
        assertEquals(expected, actual, "it should return " + expected);
    }

    @Test
    @DisplayName("Testing getStaffList")
    void getStaffList() {
        staff = new Principal("Shola", "Male",47);
        school.employStaff(staff);

        assertTrue(school.getStaffList().size() == 1, "staffList should have one staff.");

    }

    @Test
    @DisplayName("Testing getApplicants")
    void getApplicants() {
        applicant = new Applicant("Tayo", "Female", 9);
        school.acceptApplicant(applicant);

        assertTrue(school.getApplicants().size() == 1, "applicants should have one applicant.");

    }

    @Test
    @DisplayName("Testing getGrades")
    void getGrades() {
        assertTrue(school.getGrades().size() == 6, "grades should contain 6 objects.");
    }

    @Test
    @DisplayName("Testing employStaff")
    void employStaff() {
        staff = new Principal("Shola", "Male",47);
        school.employStaff(staff);
        String actual = school.getStaffList().get(0).getName();

        assertEquals("Shola", actual, "staffList should have one staff.");

    }

    @Test
    @DisplayName("Testing acceptApplicant")
    void acceptApplicant() {
        applicant = new Applicant("Tayo", "Female", 9);
        school.acceptApplicant(applicant);
        String actual = school.getApplicants().get(0).getName();

        assertEquals("Tayo", actual, "applicants should have one applicant.");

    }
}