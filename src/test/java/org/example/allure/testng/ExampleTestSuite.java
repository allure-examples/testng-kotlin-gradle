package org.example.allure.testng;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExampleTestSuite {

    @Test(description = "Successful test")
    public void successfulTest() {
        assertEquals(2, 2);
    }

}
