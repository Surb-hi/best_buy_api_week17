package stores.localhost.productdemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class DelateProductDemo extends Testbase {
    @Test
    public void delateproduct() {
        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 9999680)
                .when()
                .delete("/products/{id}");
        response.then().statusCode(200);
        System.out.println("Data is delated");
        response.prettyPrint();
    }
}
