package co.com.choucair.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.concurrent.TransferQueue;

public class CheckoutStepOnePage extends PageObject {

        public static final Target INPUT_NAME = Target.the("ingresar nombre").located(By.id("first-name"));
        public static final Target INPUT_LASTNAME = Target.the("ingresar apellido").located(By.id("last-name"));
        public static final Target INPUT_POSTALCODE = Target.the("ingresar codigo postal").located(By.id("postal-code"));
        public static final Target BUTTON_CONTINUE = Target.the("clic en continuar").located(By.id("continue"));



    }