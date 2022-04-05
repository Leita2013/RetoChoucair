package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.reto.tasks.Action.ImplicityWait;

public class GoCart implements Task{
    public static GoCart the() {
        return Tasks.instrumented(GoCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ImplicityWait();
        actor.attemptsTo(
                Click.on(ShoppingCartPage.BUTTON_CHECKOUT)
        );

    }

}