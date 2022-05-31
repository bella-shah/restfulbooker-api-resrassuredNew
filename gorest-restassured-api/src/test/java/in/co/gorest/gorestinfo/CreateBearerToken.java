package in.co.gorest.gorestinfo;

import in.co.gorest.model.TokenPojo;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateBearerToken {
    String bearerToken;
    public String gettingBearerToken(){
        TokenPojo tokenPojo = new TokenPojo();
        tokenPojo.setBearerToken("408f3334532cca031254fd9cfc0cf1da48bd59e2d7e7803299e8a03a49fad400");
        Response response = given()
                .header("Content-Type", "application/json")
                .body(tokenPojo)
                .when()
                .post();
        response.then().statusCode(200);
        bearerToken = (response.path("bearerToken"));
        response.prettyPrint();
        return bearerToken;


    }
}
