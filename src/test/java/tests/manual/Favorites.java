package tests.manual;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class Favorites {
    @Test
    @Owner("Stanislav K.")
    @Tags({@Tag("iOS"), @Tag("Android"), @Tag("Sputnik"), @Tag("SputnikAfr"), @Tag("Inosmi"), @Tag("Regress"), @Tag("UI")})
    @DisplayName(" Проверяем добавление в избранное ")
    void addNewArticlesInFavorites() {

        step(" open app ", () -> {

        });
        step(" tap first article ", () -> {

        });
        step(" tap add to favorites ", () -> {

        });
        step(" tap catalog ", () -> {

        });
        step(" tap favorites ", () -> {

        });
        step(" verify results -> you will see article what you chosen in favorites ", () -> {

        });
        step(" verify results -> size placeholders in feed in favorites ", () -> {

        });
    }
    @Test
    @Owner("Stanislav K.")
    @Tags({@Tag("iOS"), @Tag("Android"), @Tag("Sputnik"), @Tag("SputnikAfr"), @Tag("Inosmi"), @Tag("Regress"), @Tag("UI")})
    @DisplayName(" Проверяем удаление из избранного ")
    void deleteArticleInFavorites() {

        step(" open app ", () -> {

        });
        step(" tap first article ", () -> {

        });
        step(" tap add to favorites ", () -> {

        });
        step(" tap catalog ", () -> {

        });
        step(" tap favorites ", () -> {

        });
        step(" slide right to left on first article in feed ", () -> {

        });
        step(" verify results -> article in favorites deleted ", () -> {

        });
    }
    @Test
    @Owner("Stanislav K.")
    @Tags({@Tag("iOS"), @Tag("Android"), @Tag("Sputnik"), @Tag("SputnikAfr"), @Tag("Inosmi"), @Tag("Regress"), @Tag("UI")})
    @DisplayName(" Проверяем переход из избранного в статью ")
    void openArticleInFavorites() {

        step(" open app ", () -> {

        });
        step(" tap first article ", () -> {

        });
        step(" tap add to favorites ", () -> {

        });
        step(" tap catalog ", () -> {

        });
        step(" tap favorites ", () -> {

        });
        step(" tap to first articles in favorites ", () -> {

        });
        step(" verify results -> article was open ", () -> {

        });
    }
    @Test
    @Owner("Stanislav K.")
    @Tags({@Tag("iOS"), @Tag("Android"), @Tag("Sputnik"), @Tag("SputnikAfr"), @Tag("Inosmi"), @Tag("Regress"), @Tag("UI")})
    @DisplayName(" Проверяем добавление в избранное ")
    void addNewPodcastInFavorites() {

        step(" open app ", () -> {

        });

        step(" tap first article ", () -> {

        });

        step(" tap catalog ", () -> {

        });

        step(" tap podcasts ", () -> {

        });

        step(" choose any podcast ", () -> {

        });

        step(" tap add to favorites ", () -> {

        });

        step(" tap favorites ", () -> {

        });

        step(" verify results -> you will see article what you chosen in favorites ", () -> {

        });

        step(" verify results -> size placeholders in feed in favorites ", () -> {

        });
    }

}
