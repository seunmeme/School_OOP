import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    Principal principal;
    School school;
    Applicant applicant1;
    Applicant applicant2;
    Grade grade;

    @BeforeEach
    void init() {
        principal = new Principal("Shola", "Male", 47);
    }


    @Test
    @DisplayName("Testing getName")
    void getName() {
        String expected = "Shola";
        String actual = principal.getName();
        assertEquals(expected, actual, "it should return " + expected);
    }

    @Test
    @DisplayName("Testing getGender")
    void getGender() {
        String expected = "Male";
        String actual = principal.getGender();
        assertEquals(expected, actual, "it should return " + expected);
    }

    @Test
    @DisplayName("Testing getAge")
    void getAge() {
        int expected = 47;
        int actual = principal.getAge();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing getRole")
    void getRole() {
        String expected = "Principal";
        String actual = principal.getRole();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    void admitApplicant() {
        applicant1 = new Applicant("Shade", "Female", 8);
        school = new School("St. Paul", "Gbagada", 1976);
        principal.admitApplicant(applicant1, school);

        assertTrue(school.getGrades().get(3).getStudents().contains(applicant1), "Grade Four students should contain applicant");

    }

    @Test
    void expelStudent() {
        school = new School("St. Paul", "Gbagada", 1976);
        grade = new Grade("Four");
        applicant1 = new Applicant("Shade", "Female", 8);
        applicant2 = new Applicant("Jade", "Male", 8);
        principal.admitApplicant(applicant1, school);
        principal.admitApplicant(applicant2, school);
        principal.expelStudent(applicant1, grade, school);

        assertFalse(school.getGrades().get(3).getStudents().contains(applicant1), "applicant1 should be removed from students list.");


    }
}