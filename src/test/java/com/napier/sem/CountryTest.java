package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountryTest {
    static Country country;
    static App app;

    @BeforeAll
    static void init(){
        country = new Country();
        app = new App();
        app.connect("localhost:3306");
        country.setCountryCode("BRA");
    }

    @Test
    void countryNameTest(){
        assertEquals("Brazil", country.getCountryName());
    }
}
