import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for Secretary class")
class SecretaryTest {

    Secretary secretary;

    @BeforeEach
    void init() {
        secretary = new Secretary("Amara", "Female", 27);
    }

    @Test
    @DisplayName("Testing cleaner's getName")
    void getName() {
        String expected = "Amara";
        String actual = secretary.getName();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing cleaner's getGender")
    void getGender() {
        String expected = "Female";
        String actual = secretary.getGender();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing getAge")
    void getAge() {
        int expected = 27;
        int actual = secretary.getAge();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing getRole")
    void getRole() {
        String expected = "secretary";
        String actual = secretary.getRole();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing getDuty")
    void getDuty() {
        String expected = "administrative";
        String actual = secretary.getDuty();
        assertEquals(expected, actual, "it should return "+expected);
    }

    @Test
    @DisplayName("Testing service method")
    void service() {
        String expected = secretary.service();
        String actual = "Amara is a competent secretary and provides excellent administrative duties.";
        assertTrue(actual.equals(expected), "service method should return the right message.");
    }

}