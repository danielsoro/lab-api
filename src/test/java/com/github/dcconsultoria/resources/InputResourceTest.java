package com.github.dcconsultoria.resources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class InputResourceTest {

    @Test
    public void shouldListAll() {
        given().when().get("/inputs").then().statusCode(200);
    }

    @Test
    public void shouldListById() {
        given().when().get("/inputs/1").then().statusCode(200).body(is("{\"id\":1}"));
    }

    @Test
    public void shouldCreate() {
        given().contentType(APPLICATION_JSON)
                .body("{\"id\":10}").when().post("/inputs").then().statusCode(200).body(is("{\"id\":10}"));
    }

    @Test
    public void shouldUpdate() {
        given().contentType(APPLICATION_JSON)
                .body("{\"id\":10}").when().put("/inputs").then().statusCode(200).body(is("{\"id\":10}"));
    }
}
