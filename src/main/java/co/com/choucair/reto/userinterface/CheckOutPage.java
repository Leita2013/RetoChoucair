package co.com.choucair.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class CheckOutPage extends PageObject {
    public static final Target SUCCESSFUL_MSN = Target.the("mensaje compra exitosa").located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
}
