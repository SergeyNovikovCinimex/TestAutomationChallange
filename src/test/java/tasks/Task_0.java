package tasks;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static tasks.TestDataFactory.*;

public class Task_0 {
    @Test
    public void checkEmails() throws Exception {
        given().log().uri()
                .baseUri(BASE_URL)
                .param("page", PARAM_PAGE_1).
                when()
                .get("/" + ENDPOIN_USER)
                .then()
                .body("data.email", hasSize(6))
                .body("data.email", hasItems("george.bluth@reqres.in", "emma.wong@reqres.in"));
    }
    @Test
    public void postRequest() throws Exception {
        Response response = given()
                .baseUri(BASE_URL)
                .body(CREATE_JSON).
                when()
                .post("/"+ENDPOIN_USER)
                .then()
                .assertThat()
                .statusCode(201)
                .extract()
                .response();
        String datestr = response.path("createdAt").toString();
        getRuDateToConsole(datestr);



    }
}