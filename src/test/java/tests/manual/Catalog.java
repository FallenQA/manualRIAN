package tests.manual;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class Catalog {
    @Test
    @Owner("Stanislav K.")
    @Tags({@Tag("iOS"), @Tag("Android"), @Tag("Sputnik"), @Tag("RIAN"), @Tag("SputnikAfr"), @Tag("Radio"), @Tag("Inosmi"), @Tag("Regress")})
    @DisplayName(" Проверяем таймер в плеере ")
    void radioTimer() {

        step("open app", () -> {

        });
        step("open radio", () -> {

        });
        step("verify timer", () -> {

        });
    }

    @Test
    @Owner("Stanislav K.")
    @Tags({@Tag("iOS"), @Tag("Android"), @Tag("Sputnik"), @Tag("RIAN"), @Tag("SputnikAfr"), @Tag("Radio"), @Tag("Inosmi"), @Tag("Regress")})
    @DisplayName(" Проверяем остановку и запуск плеера с того же места ")
    void stopRadioAndStart() {

        step("open app", () -> {

        });
        step("open radio", () -> {

        });
        step("tap to the stop button", () -> {

        });

        step("verify result - player stopped", () -> {

        });
        step("tap to the play button", () -> {

        });
        step("verify result - player continue ", () -> {

        });

    }
}
