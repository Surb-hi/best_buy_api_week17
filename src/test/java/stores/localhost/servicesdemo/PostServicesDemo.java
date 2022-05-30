package stores.localhost.servicesdemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.model.ServicesPojo;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class PostServicesDemo extends Testbase {
    @Test
    public void postservicesDemo() {
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Best Buy shop");
        Response response = given()
                .header("Content-Type", "application/json")
                .body(servicesPojo)
                .when()
                .post("/services");
        response.prettyPrint();
        response.then().statusCode(201);
    }
}