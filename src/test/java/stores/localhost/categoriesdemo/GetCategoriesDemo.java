package stores.localhost.categoriesdemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class GetCategoriesDemo extends Testbase {
    @Test
    public void getcategoriesdemo() {
        Response response = given()
                .when()
                .get("/categories");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
