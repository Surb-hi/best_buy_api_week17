package stores.localhost.productdemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.model.ProducTPojo;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class PostProductDemo extends Testbase {
    @Test
    public void postProductDemo() {
        ProducTPojo productDemo = new ProducTPojo();
        productDemo.setName("Duracell - AAA Batteries");
        productDemo.setType("Good");
        productDemo.setPrice(5.00);
        productDemo.setUpc("041333424099");
        productDemo.setShipping(0);
        productDemo.setDescription("Compatible with select electronic devices; AAA size; DURALOCK Power Preserve technology; 4-pack");
        productDemo.setManufacturer("Duracell");
        productDemo.setModel("MN2400B4ZYU");
        productDemo.setUrl("http://www.bestbuy.com/site/duracell-aaa-batteries-4-pack/43900.p?id=1051384074145&skuId=43900&cmp=RMXCC");
        productDemo.setImage("http://img.bbystatic.com/BestBuy_US/images/products/4390/43900_sa.jpg");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(productDemo)
                .when()
                .post("/products");
        response.prettyPrint();
        response.then().statusCode(201);
    }
}