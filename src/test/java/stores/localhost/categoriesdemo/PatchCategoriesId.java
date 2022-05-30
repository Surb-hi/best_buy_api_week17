package stores.localhost.categoriesdemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.model.CategoriesPojo;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class PatchCategoriesId extends Testbase {
    @Test
    public void patchcategoriesDemo() {
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setId("0101");
        categoriesPojo.setName("Gift'S shop");
        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", "0101")
                .body(categoriesPojo)
                .when()
                .patch("/categories/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
