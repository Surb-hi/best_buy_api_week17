package stores.localhost.categoriesdemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class DelateCategoriesDemo extends Testbase {
    @Test
    public void delatecategories() {
        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", "abcat0020001")
                .when()
                .delete("/categories/{id}");
        response.then().statusCode(200);
        System.out.println("Data is delated");
        response.prettyPrint();
    }
}
