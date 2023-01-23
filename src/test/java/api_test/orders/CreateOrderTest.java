package api_test.orders;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.example.apiBB.order.*;
import org.example.apiBB.user.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CreateOrderTest {
    private OrderCreate orderCreate;
    private OrderGenerator generator = new OrderGenerator();
    private OrderSteps step;
    private User user;
    OrderAssertions assertions = new OrderAssertions();
    String token;
    String ordersId;

   @Before
   @Step("Создаем юзера и получаем его токен для дальнейших проверок(Rob)")
    public void getToken() {
       step = new OrderSteps();
       user = new User("D8BB705A-99BD-4306-93E0-2A7D5AF91950", "38736");
       token = step.getToken(user);

   }
   @Test
   @Description("Create order and check response")
   @Step("Проверяем, что ордер создается с 200 ок и в ответе есть Mode:mobile + вытаскиваем id для удаления")
    public void createOrderTest() {
       orderCreate = generator.getOrderHonor();
      Response responseCreate = step.createOrder(orderCreate);
       assertions.checkCreate(responseCreate);
       OrderResponse orderResponse = responseCreate.getBody().as(OrderResponse.class);
       ordersId = orderResponse.getOrderID().toString();
   }
   @Test
   @Description("Create order with invalid devices id")
    @Step("Проверяем, что при невалидном id девайса приходит ошибка 404")
    public void createOrderFalseTest() {
       orderCreate = generator.getOrderFasle();
       Response responseFailed = step.createOrder(orderCreate);
       assertions.checkCreateFalse(responseFailed);
       ordersId = "";
   }
    @Test
    @Description("Create order with invalid body")
    @Step("Проверяем, что при невалидном запросе приходит ошибка 400")
    public void createOrderError() {
       orderCreate = generator.getOrderError();
       ValidatableResponse responseCreateError = step.createOrder(orderCreate).then();
       assertions.checkGetOrderErrorMessage(responseCreateError);
        ordersId = "";
    }

   @After
    @Step("delete test orders")
    public void orderDelete() {
       if (ordersId.length() > 1) {
           step.orderDelete("[ " + "\"" + ordersId + "\"" + " ]");
       } else {
           System.out.println("Удалять нечего");
       }

   }
}
