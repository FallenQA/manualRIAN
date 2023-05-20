package specs;

import io.qameta.allure.model.Status;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.BODY;
import static io.restassured.filter.log.LogDetail.STATUS;

public class SpecForApi {
    public static RequestSpecification requestApi = with()
            .filter(new AllureRestAssured())
            .log().uri()
            .log().body()
            .contentType(ContentType.JSON)
            .baseUri("https://ria.ru");

    public static ResponseSpecification responseApi = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .build();
}
