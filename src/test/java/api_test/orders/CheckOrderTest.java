package api_test.orders;

import com.codeborne.selenide.commands.Val;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.example.apiBB.order.*;
import org.example.apiBB.user.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckOrderTest {
    private OrderCreate orderCreate;
    private OrderGenerator generator = new OrderGenerator();
    private OrderResponse responseForId;
    private OrderSteps step;
    private User user;
    OrderAssertions check = new OrderAssertions();
    String token;
    String ordersId;
    @Before
    @Step("Получаем токен, создаем ордер, вытаскиваем из созданного ордера Id для проверок.")
    public void preconditions() {
        step = new OrderSteps();
        user = new User("D8BB705A-99BD-4306-93E0-2A7D5AF91950", "38736");
        token = step.getToken(user);
        orderCreate = generator.getOrderHonor();
        Response responseCreate = step.createOrder(orderCreate);
        responseForId = responseCreate.getBody().as(OrderResponse.class);
        ordersId = responseForId.getOrderID().toString();
    }
    @Test
    @Description("Check response Order/Get")
    public void getOrder() {
       ValidatableResponse response = step.getOrder(ordersId);
       check.checkGetOrderBody(response);
    }
    @Test
    @Description("Check response Order/Get with invalid orderId")
    public void getOrderFalse() {
        ValidatableResponse responseError = step.getOrder(ordersId + "qwe");
        check.checkGetOrderErrorMessage(responseError);
    }
    @After
    public void deleteOrderTest() {
        if (ordersId.length() > 1) {
            step.orderDelete("[ " + "\"" + ordersId + "\"" + " ]");
        } else {
            System.out.println("Удалять нечего");
        }
    }
}