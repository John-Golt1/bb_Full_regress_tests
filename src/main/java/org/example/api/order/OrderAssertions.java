package org.example.api.order;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class OrderAssertions {
    private String ordersId;
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
    public void checkFullDataOrder(ValidatableResponse response, String ordersId) {
        response.statusCode(200).log().all()
                .body("Id", equalTo(ordersId)).and().body("OrderNumber", greaterThan(0));
    }
    public void changeStatusOrder(ValidatableResponse response, String ordersId) {
        response.statusCode(200).log().all()
                .body("Id", equalTo(ordersId)).and().body("Status", equalTo("Canceled"));
    }
}
