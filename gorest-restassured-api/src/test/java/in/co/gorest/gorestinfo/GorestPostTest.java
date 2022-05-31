package in.co.gorest.gorestinfo;

import in.co.gorest.model.GorestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GorestPostTest extends TestBase {

    @Test
    public void creteAUser(){
        GorestPojo goRestPojo = new GorestPojo();
        goRestPojo.setName("Tenali Ramakrishna1");
        goRestPojo.setGender("female");
        goRestPojo.setEmail("tenali.ramakrishna1318@gmail.com");
        goRestPojo.setStatus("active");

        Response response = given()
                .header("Content-Type","application/json")
                .header("Authorization","Bearer 408f3334532cca031254fd9cfc0cf1da48bd59e2d7e7803299e8a03a49fad400")
                .body(goRestPojo)
                .when()
                .post();
        response.prettyPrint();
        response.then().statusCode(201);

    }

}
