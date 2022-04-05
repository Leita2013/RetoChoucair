package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.FinishShoppingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Finish implements Task {


    public static Finish the() {
        return Tasks.instrumented(Finish.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ImplicitlyWait();
        actor.attemptsTo(
                Click.on(FinishShoppingPage.BUTTON_FINISH)
        );
        
    }

    private void ImplicitlyWait() {
    }
}
