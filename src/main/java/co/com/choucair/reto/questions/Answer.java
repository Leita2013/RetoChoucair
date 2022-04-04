package co.com.choucair.reto.questions;

import co.com.choucair.reto.userinterface.SearchItemPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Question<Boolean> toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameItem = Text.of(SearchItemPage.NAME_ITEM).viewedBy(actor).asString();
        if (question.equals(nameItem)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
