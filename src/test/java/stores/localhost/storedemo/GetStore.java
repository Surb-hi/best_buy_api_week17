package stores.localhost.storedemo;

import io.restassured.response.Response;
import org.junit.Test;
import stores.localhost.testbase.Testbase;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetStore extends Testbase {


    @Test
    public void test001() {
        Response response = given()
                .when()
                .get("/stores");
        response.then().statusCode(200);
//        1. Extract the limit
        int limit = response.then().extract().path("limit");
        System.out.println("001 Limit value is : " + limit);

//        2. Extract the total
        int total = response.then().extract().path("total");
        System.out.println("002 Total value is : " + total);


//        3. Extract the name of 5 the store
        String storename = response.then().extract().path("data[5].name");
        System.out.println("003 Store name value is : " + storename);


//        4. Extract the names of all the store
        List<String> allstorename = response.then().extract().path("data.name");
        System.out.println("004 All store name value is : " + allstorename);

//        5. Extract the storeId of all the store
        List<String> allstoreid = response.then().extract().path("data.id");
        System.out.println("005 All store id value is : " + allstoreid);

//        6. Print the size of the data list
        List<Integer> datasize = response.then().extract().path("data");
        System.out.println("006 Data size value is : " + datasize);

//        7. Get all the value of the store where datasize = St Cloud
        List<Object> nameList = response.then().extract().path("data.findAll{it.name=='St Cloud'}");
        System.out.println("007 Store name value is : " + nameList);

//        8. Get the address of the store where store name = Rochester
        List<Object> listaddress = response.then().extract().path("data.findAll{it.name=='Rochester'}.address");
        System.out.println("008 Address value is : " + listaddress);

//        9. Get all the services of 8 the store
        List<Object> allservices = response.then().extract().path("data.findAll{it.id==8}.services");
        System.out.println("009 Store services value is : " + allservices);

//        10. Get storeservices of the store where service name = Windows Store
        List<Object> storeservices = response.then().extract().path("data.find{it.services}.services.findAll{it.name='Windows Store'}.storeservices");
        System.out.println("010 Services value is : " +storeservices);

//        11. Get all the storeId of all the store
        List<Object> allstoreid1 = response.then().extract().path("data.id");
        System.out.println("011 Store id services value is : " + allstoreid1);

//        12. Get id of all the store
        List<Object> allstoreid2 = response.then().extract().path("data.id");
        System.out.println("012 Store id services value is : " + allstoreid2);

//        13. Find the store names Where state = ND
        List<Object> storename1 = response.then().extract().path("data.findAll{it.state=='ND'}.name");
        System.out.println("013 Store name value is : " + storename1);

//        14. Find the Total number of services for the store where store name = Rochester
        List<Object> totalnumberservice = response.then().extract().path("data.findAll{it.name=='Rochester'}");
        System.out.println("014 Total number of service  value is : " +totalnumberservice.size());

//        15. Find the createdAt for all services whose name = “Windows Store”
        List<Object> createdAt = response.then().extract().path("data.find{it.services}.services.findAll{it.name=='Windows Store'| it.storeservices=='createdAt'}");
        System.out.println("015 CreatedAt of service  value is : " +createdAt);

//        16. Find the name of all services Where store name = “Fargo”
        List<Object> servicesname = response.then().extract().path("data.findAll{it.name=='Fargo'}.services");
        System.out.println("016 Services name of service  value is : " +servicesname);

//        17. Find the zip of all the store
        List<Object> zipstore = response.then().extract().path("data.zip");
        System.out.println("017 Zip store services value is : " + zipstore);


//        18. Find the zip of store name = Roseville
        List<Object> zipstorename = response.then().extract().path("data.findAll{it.name=='Roseville'}.zip");
        System.out.println("018 Zip store name of service  value is : " +zipstorename);

//        19. Find the storeservices details of the service name = Magnolia Home Theater
        List<Object> storeservices1 = response.then().extract().path("data.find{it.services}.services.findAll{it.name='Magnolia Home Theater'}.storeservices");
        System.out.println("019 Services value is : " +storeservices1);

//        20. Find the lat of all the stores
        List<Object> latstore = response.then().extract().path("data.lat");
        System.out.println("020 Lat store services value is : " +latstore);


        response.prettyPrint();

    }
}