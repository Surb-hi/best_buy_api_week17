package stores.localhost.productdemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class GetProductId extends Testbase {
    @Test
    public void getproduct() {
        Response response = given()
                .pathParam("id", 9999681)
                .when()
                .get("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
