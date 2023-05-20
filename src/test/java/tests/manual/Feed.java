package tests.manual;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class Feed {
    @Test
    @Owner("Stanislav K.")
    @Tags({@Tag("iOS"), @Tag("Android"), @Tag("Sputnik"), @Tag("SputnikAfr"), @Tag("Regress")})
    @DisplayName("Проверяем свитчер при перезапуске приложения")
    void turnOnSwitcherImageAndLookAtResults() {

        step("open app", () -> {

        });
        step("open settings", () -> {

        });
        step("turn on switcher load images", () -> {

        });

        step("close app", () -> {

        });
        step("open app", () -> {

        });
        step("verify results -> look at feed images, they will visible", () -> {

        });
    }
    @Test
    @Owner("Stanislav K.")
    @Tags({@Tag("iOS"), @Tag("Android"), @Tag("Sputnik"), @Tag("SputnikAfr"), @Tag("Regress")})
    @DisplayName("Проверяем свитчер при перезапуске приложения")
    void stopRadioAndStart() {

        step("open app", () -> {

        });
        step("open settings", () -> {

        });
        step("turn on switcher load images", () -> {

        });

        step("close app", () -> {

        });
        step("open app", () -> {

        });
        step("verify results -> look at feed images, they will visible", () -> {

        });
    }
}
