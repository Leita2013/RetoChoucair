package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.RetoLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(RetoLoginPage.USERNAME),
                Enter.theValue("secret_sauce").into(RetoLoginPage.PASSWORD),
                Click.on(RetoLoginPage.LOGIN_BUTTON)
        );

    }
}
