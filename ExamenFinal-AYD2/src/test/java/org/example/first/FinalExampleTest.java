package org.example.first;


import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FinalExampleTest {

    private final String NAME = "name";
    private final String EMAIL = "email@gmail.com";
    private final String PHONE = "phone";
    private final String ADDRESS = "address";
    private final String CITY = "city";
    private final String ZIP = "zip";

    private FinalExample finalExample;

    @BeforeEach
    void setUp() {
        finalExample = new FinalExample();
    }

    @Test
    public void shouldCreateUser() {

        String expect = "User created: " + NAME;

        String actual = finalExample.createUser(NAME, EMAIL, PHONE, ADDRESS, CITY, ZIP);

        assertEquals(expect, actual);
    }

    @Test
    public void shouldCrateInvalidUser() {

        String expect = "Name cannot be empty";

        String actual = finalExample.createUser(null, EMAIL, PHONE, ADDRESS, CITY, ZIP);

        assertEquals(expect, actual);
    }

    @Test
    public void shouldCrateInvalidEmail() {

        String expect = "Invalid email";

        String actual = finalExample.createUser(NAME, "", PHONE, ADDRESS, CITY, ZIP);

        assertEquals(expect, actual);
    }

    @Test
    public void shouldCalculateAreaCircle() {
        String shape = "circle";
        double[] dimensions = new double[]{2, 2};

        double expect = 12.566370614359172;

        double actual = finalExample.calculateArea(shape, dimensions);

        assertEquals(actual,expect);

    }

    @Test
    public void shouldCalculateAreaRectangle() {
        String shape = "rectangle";
        double[] dimensions = new double[]{2, 5};

        double expect = 10.0;
        double actual = finalExample.calculateArea(shape, dimensions);

        assertEquals(actual,expect);
    }

    @Test
    public void shouldCalculateAreaTriangle() {

        String shape = "triangle";
        double[] dimensions = new double[]{2, 6};

        double expect = 6.0;
        double actual = finalExample.calculateArea(shape, dimensions);

        assertEquals(actual,expect);
    }

    @Test
    public void shouldCalculateAreaHaveException() {

        String shape = "square";
        double[] dimensions = new double[]{2, 6};

        assertThrows(IllegalArgumentException.class, () -> finalExample.calculateArea(shape, dimensions));
    }
}
