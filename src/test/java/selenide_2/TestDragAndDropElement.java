package selenide_2;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestDragAndDropElement {
    @Test
    void testDragAndDrop() {

        open("https://the-internet.herokuapp.com/drag_and_drop");

        SelenideElement sourceElem = $(By.id("column-a")), targetElem = $(By.id("column-b"));

        sourceElem.shouldHave(text("A"));
        targetElem.shouldHave(text("B"));
        sourceElem.dragAndDropTo(targetElem);
        sourceElem.shouldHave(text("B"));
        targetElem.shouldHave(text("A"));

    }
}

