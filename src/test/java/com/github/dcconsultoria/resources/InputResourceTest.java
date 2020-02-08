/*
 * Copyright 2020 DC Consultoria
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.dcconsultoria.resources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static org.hamcrest.Matchers.is;

/**
 * @author <a href="mailto:danielsoro@apache.org">Daniel "soro" Cunha</a>
 */
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
