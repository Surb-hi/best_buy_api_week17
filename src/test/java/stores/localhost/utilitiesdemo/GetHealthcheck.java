package stores.localhost.utilitiesdemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class GetHealthcheck extends Testbase {
    @Test
    public void gethealthcheckdemo() {
        Response response = given()
                .when()
                .get("/Healthcheck");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
