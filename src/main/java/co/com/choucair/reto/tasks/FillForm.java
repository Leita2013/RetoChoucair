package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.CheckoutStepOnePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;


public class FillForm implements Task {

    private String name, lastname, postalCode;

    public FillForm(String name, String lastname, String postalCode) {
        this.name = name;
        this.lastname = lastname;
        this.postalCode = postalCode;
    }

    public static FillForm the(String name, String lastname, String postalCode) {
        return Tasks.instrumented(FillForm.class, name, lastname, postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into((Target) CheckoutStepOnePage.INPUT_NAME),
                Enter.theValue(lastname).into((Target) CheckoutStepOnePage.INPUT_LASTNAME),
                Enter.theValue(postalCode).into((Target) CheckoutStepOnePage.INPUT_POSTALCODE),
                Click.on((Target) CheckoutStepOnePage.BUTTON_CONTINUE )


        );

    }

}