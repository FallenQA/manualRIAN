package tests.API.checkstatus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static specs.SpecForApi.requestApi;
import static specs.SpecForApi.responseApi;


public class CheckStatusRiaNews {
    @Test
    @Tags({@Tag("API"), @Tag("RIAN")})
    @DisplayName("Проверяем статус запроса на тег политика")
    void successfulCheckStatusWithTagPolitics() {


        given(requestApi)
                .get("/politics")
                .then()
                .spec(responseApi)
                .statusCode(200);
    }

    @Test
    @Tags({@Tag("API"), @Tag("RIAN")})
    @DisplayName("Проверяем статус запроса на сайт")
    void successfulCheckStatusWithWeb() {


        given(requestApi)
                .get()
                .then()
                .spec(responseApi)
                .statusCode(200);
    }

    @Test
    @Tags({@Tag("API"), @Tag("RIAN")})
    @DisplayName("Проверяем статус запроса на сервис регистрации")
    void checkStatusForRegistration() {

        String body = "{ \"email\": \"1234567898765@mail.ru\", \"password\": \"cityslicka1\" }";
        given(requestApi)
                .body(body)
                .when()
                .post("/services/id/register/")
                .then()
                .spec(responseApi)
                .statusCode(200);
    }
}