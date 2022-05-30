package stores.localhost.categoriesdemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.model.CategoriesPojo;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class PostCategoriesDemo extends Testbase {
    @Test
    public void postcategoriesDemo() {
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setId("01011abcd");
        categoriesPojo.setName("Gift shop");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(categoriesPojo)
                .when()
                .post("/categories");
        response.prettyPrint();
        response.then().statusCode(201);
    }
}