package rian.manual;

import io.qameta.allure.Owner;
import jdk.jfr.Label;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ManualCheckIcons {
    @Test
    @Owner("Stanislav K.")
    @Tags({@Tag("iOS"), @Tag("Android"), @Tag("Sputnik"), @Tag("RIAN"), @Tag("SputnikAfr"), @Tag("Inosmi"), @Tag("Radio"), @Tag("FirstStart"), @Tag("Regress"), @Tag("UI")})
    @Label("Manual")
    @DisplayName("Проверяем отображение верной иконки приложения(плеера) в шторке")
    void checkRadioIconInNotification() {
        // pre-condition - Первый старт приложение после установки
        step("open app", () -> {

        });
        step("open radio", () -> {

        });
        step("Roll up app", () -> {

        });
        step("Scroll down curtain", () -> {

        });

        step("verify Icon for player in curtain ", () -> {

        });

    }
    @Test
    @Owner("Stanislav K.")
    @Tags({@Tag("iOS"), @Tag("Android"), @Tag("Sputnik"), @Tag("RIAN"), @Tag("SputnikAfr"), @Tag("Inosmi"), @Tag("Radio"), @Tag("FirstStart"), @Tag("Regress"), @Tag("UI")})
    @Label("Manual")
    @DisplayName("отображение иконка при пуш уведомлении")
    void checkPushIconInNotification() {
        // pre-condition - Первый старт приложение после установки
        step("you will need to send push notification on your device( OneSignal )", () -> {

        });

        step("Scroll down curtain", () -> {

        });

        step("verify Icon for push notifications in curtain ", () -> {

        });

    }
    @Test
    @Owner("Stanislav K.")
    @Tags({@Tag("iOS"), @Tag("Android"), @Tag("Sputnik"), @Tag("RIAN"), @Tag("SputnikAfr"), @Tag("Inosmi"), @Tag("Radio"), @Tag("FirstStart"), @Tag("Regress"), @Tag("UI")})
    @Label("Manual")
    @DisplayName("Проверяем отображение иконки приложения и при свернутом состоянии")
    void checkAppIcon() {
        // pre-condition - Первый старт приложение после установки
        step("open app", () -> {

        });

        step("Roll up app / проверить отображение иконки в полусвернутом состоянии", () -> {

        });

        step("verify Icon in desktop and roll up 50 | 50 ", () -> {

        });

    }
}
