package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.SearchItemPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Search implements Task {
    public Search(String item) {
        this.item = item;
    }

    private String item;

    public static Search the(String item) {
        return Tasks.instrumented(Search.class,item);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchItemPage.ADD_CART),
                Click.on(SearchItemPage.SELECT_ITEM),
                Click.on(SearchItemPage.CHECK_ITEM)
        );

    }
}
