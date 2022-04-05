package co.com.choucair.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinishShoppingPage extends PageObject {
    public static final Target BUTTON_FINISH = Target.the("finalizar compra").located(By.id("finish"));
}
