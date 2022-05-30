package stores.localhost.productdemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class GetProductDemo extends Testbase {
    @Test
    public void getproductdemo() {
        Response response = given()
                .when()
                .get("/products");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
