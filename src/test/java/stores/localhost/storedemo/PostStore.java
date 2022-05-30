package stores.localhost.storedemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.model.StorePojo;
import stores.localhost.testbase.Testbase;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostStore extends Testbase {
    @Test
    public void createstore() {
        HashMap<Object, Object> storeservices1 = new HashMap<>();
        storeservices1.put("createdAt", "2016-11-17T17:57:09.213Z");
        storeservices1.put("updatedAt", "2016-11-17T17:57:09.213Z");
        storeservices1.put("storeId", "3");
        storeservices1.put("serviceId", "1");

        HashMap<Object, Object> storeservices2 = new HashMap<>();
        storeservices1.put("createdAt", "2017-11-17T17:57:09.213Z");
        storeservices1.put("updatedAt", "2017-11-17T17:57:09.213Z");
        storeservices1.put("storeId", "6");
        storeservices1.put("serviceId", "2");


        HashMap<Object, Object> services = new HashMap<>();
        services.put("id", "10");
        services.put("name", "Geek Squae");
        services.put("createdAt", "2019-11-17T17:56:35.881Z");
        services.put("updatedAt", "2019-11-17T17:56:35.881Z");
        services.put("storeservices0", storeservices1);
        services.put("storeservices1", storeservices2);


        StorePojo postStorepojo = new StorePojo();
        postStorepojo.setName("Minnetonkasss");
        postStorepojo.setType("BigBoxx");
        postStorepojo.setAddress("13513 Ridgedale Dr");
        postStorepojo.setCity("Hopkins");
        postStorepojo.setState("MN");
        postStorepojo.setZip("5530567");
        postStorepojo.setLat(44.9696);
        postStorepojo.setLng(93.4495);
        postStorepojo.setHours("Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8");
        postStorepojo.setServices(services);

        Response response = given()
                .header("Content-Type", "application/json")
                .body(postStorepojo)
                .when()
                .post("/stores");
        response.prettyPrint();
        response.then().statusCode(201);
    }

}
