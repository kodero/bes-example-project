package org.acme.hibernate.orm;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsNot.not;

@QuarkusTest
public class IDTypeResourceTest {

    @Test
    public void testListAllIDTypes(){
        //List all, should have all 3 fruits the database has initially:
        given()
                .when().get("/v2/id-types")
                .then()
                .statusCode(200)
                .body(
                        containsString("National ID"));
    }    
}
