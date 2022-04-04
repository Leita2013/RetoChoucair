package co.com.choucair.reto.stepdefinitions.co.com.choucair.reto;

import co.com.choucair.reto.questions.Answer;
import co.com.choucair.reto.tasks.Login;
import co.com.choucair.reto.tasks.OpenUp;
import co.com.choucair.reto.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class stepdefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than the user Pedro wants to select a product$")
    public void thanTheUserPedroWantsToSelectAProduct() {
        OnStage.theActorCalled("Pedro").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }


    @When("^he search (.*) on the portal web$")
    public void heSearchSauceLabsBackpackOnThePortalWeb(String item) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(item));

    }

    @Then("^he finds the item (.*)$")
    public void heFindsTheItemSauceLabBackpack(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}
