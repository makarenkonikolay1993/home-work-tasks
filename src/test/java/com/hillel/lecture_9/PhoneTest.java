package com.hillel.lecture_9;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PhoneTest {

    @Test
    public void cellPhoneCreationTest() {

        CellPhone cellPhone = new CellPhone("Second Provider", "Cell phone", "Android OS", "+380999999999");

        CellPhone expectedResult = new CellPhone("Second Provider", "Cell phone", "Android OS", "+380999999999");

        assertEquals(cellPhone.hashCode(), expectedResult.hashCode());
    }

    @Test
    public void landlinePhoneCreationTest() {

        LandlinePhone homePhone = new LandlinePhone("First Provider", "Landline phone", "No OS", "+380562323232");
        LandlinePhone expectedResult = new LandlinePhone("First Provider", "Landline phone", "No OS", "+380562323232");

        assertEquals(homePhone, expectedResult);

    }

    @Test
    public void equalsObjects() {

        LandlinePhone homePhone = new LandlinePhone("First Provider", "Landline phone", "No OS", "+380562323232");

        CellPhone cellPhone = new CellPhone("Second Provider", "Cell phone", "Android OS", "+380999999999");

        assertEquals(homePhone.hashCode() == cellPhone.hashCode(), false);

    }
}
