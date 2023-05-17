package rian.manual;

import org.junit.jupiter.api.*;
import static io.qameta.allure.Allure.step;


public class Permission {
    @Test
    @Tags({@Tag("iOS"), @Tag("Sputnik"), @Tag("firstStart"), @Tag("SputnikAfr")})
    @DisplayName("check permission to tracking people")
            void permissionTracking() {
        // pre-condition - Первый старт приложение после установки
        step("open app", () -> {

        });
        step("tap to accept on permission push", () -> {

        });
        step("choose language in list", () -> {

        });
        step("tap to accept button", () -> {

        });
        step("check permission (Would you lick to see personalized ads?)", () -> {

        });
        step("tap continue button)", () -> {

        });
        step("verify push permission", () -> {

        });

    }
    @Test
    @Tags({@Tag("iOS"), @Tag("Sputnik"), @Tag("firstStart"), @Tag("SputnikAfr")})
    @DisplayName("check permission for push")
    void checkPermissionPush() {
        // pre-condition - Первый старт приложение после установки
        step("open app", () -> {

        });
        step("verify permission for push by Onesignal", () -> {

        });
    }
}
