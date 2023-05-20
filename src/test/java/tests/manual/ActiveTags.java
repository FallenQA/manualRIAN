package tests.manual;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ActiveTags {
    @Test
    @Owner("Stanislav K.")
    @Tags({@Tag("iOS"), @Tag("Android"), @Tag("Sputnik"), @Tag("SputnikAfr"), @Tag("Inosmi"), @Tag("Regress"), @Tag("UI")})
    @DisplayName(" Проверяем отображение тегов внизу статьи ")
    void checkVisibleTagsInArticle() {

        step(" open app ", () -> {

        });
        step(" tap first article ", () -> {

        });
        step(" scroll down to the tags ", () -> {

        });
        step(" verify results -> you will see tags ", () -> {

        });
    }
    @Test
    @Owner("Stanislav K.")
    @Tags({@Tag("iOS"), @Tag("Android"), @Tag("Sputnik"), @Tag("SputnikAfr"), @Tag("Inosmi"), @Tag("Regress"), @Tag("UI")})
    @DisplayName(" Проверяем переход по тегу из статьи ")
    void nextToTagInArticle() {

        step(" open app ", () -> {

        });
        step(" tap first article ", () -> {

        });
        step(" scroll down to the tags ", () -> {

        });
        step(" tap to any tag ", () -> {

        });
        step(" verify results -> you will see new table with chain by tag ", () -> {

        });
    }
}
