package stores.localhost.servicesdemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.model.ServicesPojo;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class PatchServicesId extends Testbase {
    @Test
    public void patchservicesDemo() {
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Best shop");
        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 23)
                .body(servicesPojo)
                .when()
                .patch("/services/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
