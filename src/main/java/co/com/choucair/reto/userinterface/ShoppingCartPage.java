package co.com.choucair.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartPage extends PageObject {

    public static final Target BUTTON_CHECKOUT = Target.the("botón checkout")
            .located(By.id("checkout"));

}