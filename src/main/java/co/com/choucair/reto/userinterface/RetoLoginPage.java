package co.com.choucair.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RetoLoginPage extends PageObject {
    public static final Target USERNAME = Target.the("Ingresar usuario").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("ingresa contraseña").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("clic en ingresar").located(By.id("login-button"));
}
