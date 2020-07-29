import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for Cleaner class")
class CleanerTest {

    Cleaner cleaner;

    @BeforeEach
    void init() {
        cleaner = new Cleaner("Joy", "Female", 21);
    }


    @Test
    @DisplayName("Testing cleaner's getName")
    void getName() {
        String expected = "Joy";
        String actual = cleaner.getName();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing cleaner's getGender")
    void getGender() {
        String expected = "Female";
        String actual = cleaner.getGender();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing getAge")
    void getAge() {
        int expected = 21;
        int actual = cleaner.getAge();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing getRole")
    void getRole() {
        String expected = "cleaner";
        String actual = cleaner.getRole();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing getDuty")
    void getDuty() {
        String expected = "ancillary";
        String actual = cleaner.getDuty();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing service method")
    void service() {
        String expected = cleaner.service();
        String actual = "Joy is a cleaner and provides ancillary support.";
        assertTrue(actual.equals(expected), "service method should return the right message.");
    }

}