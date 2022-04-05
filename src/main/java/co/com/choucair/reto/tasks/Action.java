package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Action implements Task {
    public static Performable ImplicityWait() {
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {}
        return null;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        );
    }
}
