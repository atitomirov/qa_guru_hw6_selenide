package selenide_2;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CheckEnterprisePage {
    @Test
    void testEnterprisePageWithHover() {

        open("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $("[href='/enterprise']").click();
        $(".application-main ").shouldHave(text("Build like the best"));

    }
}
