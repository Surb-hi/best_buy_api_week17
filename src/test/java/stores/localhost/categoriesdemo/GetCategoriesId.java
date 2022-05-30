package stores.localhost.categoriesdemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class GetCategoriesId extends Testbase {
    @Test
    public void getcategories() {
        Response response = given()
                .pathParam("id", "01011abcd")
                .when()
                .get("/categories/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
