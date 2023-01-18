package org.example.apiBB.order;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class OrderAssertions {
    public void checkCreate(Response response) {
        response.then().statusCode(200).body("Mode", equalTo("Mobile"));
    }
    public void checkCreateFalse(Response response) {
        response.then().log().all()
                .statusCode(400);
    }
    public void checkGetOrderBody(ValidatableResponse response) {
        response.statusCode(200).log().all()
                .body("Status", equalTo("New"))
                .and()
                .body("OrderNumber", greaterThan(0));
    }
    public void checkGetOrderErrorMessage(ValidatableResponse response) {
        response.statusCode(400).log().all()
                .body("title", equalTo("One or more validation errors occurred."));
    }


}
