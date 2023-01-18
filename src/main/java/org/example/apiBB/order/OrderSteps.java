package org.example.apiBB.order;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.example.apiBB.client.Client;
import org.example.apiBB.user.User;

import static io.restassured.RestAssured.given;

public class OrderSteps extends Client {
//    private static final String NSTST_URL = "https://bb.nstst.net/";
    private static final String NSTST_URL = "https://bb.nstst.net/";
    private static final String POST_CREATE_ORDER = "Orders/Create";
    private static final String POST_ACCOUNT_AUTH = "Account/Auth";
    private static final String POST_ORDER_DELETE = "Orders/Delete";
    private static final String GET_ORDERS = "Orders/Get/";
    private String token;
    @Description("Запрос на получение токена")
    public String getToken(User user) {
        return token = getSpec()
                        .body(user)
                        .when()
                        .post(POST_ACCOUNT_AUTH)
                        .then().log().all()
                        .extract()
                        .path("access_token");
    }
    @Description("Создание ордера")
    public Response createOrder(OrderCreate orderCreate) {
        return getSpec()
                .header("Authorization","Bearer " + token)
                .body(orderCreate)
                .when()
                .post(POST_CREATE_ORDER);
    }
    @Description("Повторяющиеся действия в отельном методе")
    private static RequestSpecification getSpec() {
        return given().log().all()
                .contentType(ContentType.JSON)
                .baseUri(NSTST_URL);
    }
    @Description("Удаление ордера")
    public void orderDelete(String ordersId) {
        getSpec()
                .header("Authorization","Bearer " + token)
                .body(ordersId)
                .when().log().all()
                .post(POST_ORDER_DELETE);
    }
    @Description("Получение ордера")
    public ValidatableResponse getOrder(String ordersId) {
        return getSpec()
                .header("Authorization","Bearer " + token)
                .when()
                .param("id", ordersId)
                .get(GET_ORDERS).then();
    }
}
