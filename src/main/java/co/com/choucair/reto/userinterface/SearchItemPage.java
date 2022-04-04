package co.com.choucair.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchItemPage extends PageObject {
    public static final Target SELECT_ITEM = Target.the("selecciona el item").located(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
    public static final Target NAME_ITEM = Target.the("extrae nombre del item").located(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]"));
}
