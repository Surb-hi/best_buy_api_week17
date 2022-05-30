package stores.localhost.storedemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.testbase.Testbase;

import static io.restassured.RestAssured.given;

public class GetId extends Testbase {
    @Test
    public void getstore(){
        Response response=given()
                .pathParam("id",8925 )
                .when()
                .get("/stores/{id}");
        response.then().statusCode(200);
        System.out.println("Data is delated");
        response.prettyPrint();
    }
}
