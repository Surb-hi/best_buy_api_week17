package stores.localhost.servicesdemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class GetServicesId extends Testbase {
    @Test
    public void getservices() {
        Response response = given()
                .pathParam("id", 23)
                .when()
                .get("/services/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
