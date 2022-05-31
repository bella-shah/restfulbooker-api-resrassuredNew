package com.herokuapp.restful_booker.restfulbookerinfo;

import com.herokuapp.restful_booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestfulDeleteTest extends TestBase {
    @Test
    public void deleteAllBookingInfo() {
        CreateToken createToken = new CreateToken();
        String token = createToken.gettingToken();
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", "token = 029279aa1c844ba")
                .basePath("/booking")
                .pathParam("id", 1315)
                .when()
                .delete("/{id}");
        response.prettyPrint();
        response.then().statusCode(201);
    }

}

