import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class MyStepdefs {

    @Then("Open TestBase {string} page")
    public void openTestBasePage(String arg0) {
        Selenide.open(arg0);
    }

    @Then("Click {string} link")
    @DisplayName("01 my test")
    public void clickLink(String arg0) {
        step("- Клик по кнопке Ипотека", () -> {
            $$(".header_full_bottom_menu_item__name--16ac1").findBy(text("Ипотека")).click();
        });

        sleep(5000);

    }





/*
    @Test
    @DisplayName("05 Checking a false link number two")
    void checkingFalseLink02() {
        step("- Проверка ложной ссылки №1", () -> {

        });
    }
*/


}
