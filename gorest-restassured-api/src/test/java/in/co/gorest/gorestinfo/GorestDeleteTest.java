package in.co.gorest.gorestinfo;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GorestDeleteTest extends TestBase {
    @Test
    public void deleteAUserId() {
        Response response = given()
                .header("Content-Type", "application.json")
                .header("Authorization", "Bearer 408f3334532cca031254fd9cfc0cf1da48bd59e2d7e7803299e8a03a49fad400")
                .pathParam("id", 10903)
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }


}

