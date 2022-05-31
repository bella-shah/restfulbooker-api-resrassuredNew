package com.herokuapp.restful_booker.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;


public class TestBase {
    // set up the environment
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";


    }


}