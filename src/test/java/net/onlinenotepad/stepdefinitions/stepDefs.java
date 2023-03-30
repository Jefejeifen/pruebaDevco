package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.onlinenotepad.questions.ValidatesTheWrittenWord;
import net.onlinenotepad.tasks.ClickRickTextNote;
import net.onlinenotepad.tasks.ClicksOnBold;
import net.onlinenotepad.tasks.WritesTheNameDylan;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class stepDefs {


    @Managed(driver = "chrome")
    static WebDriver driver;

    @Before
    public void prepareStage() {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Dylan");
    }

    @Given("the user enter on the page")
    public void theUserEnterOnThePage() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.online-notepad.net/es/bloc-de-notas-online"));

    }

    @When("the user clicks on the rich text note")
    public void theUserClicksOnTheRichTextNote() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickRickTextNote.clickRickTextNote());
    }

    @When("the user clicks on bold")
    public void theUserClicksOnBold() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicksOnBold.clicksOnBold());
    }

    @When("^the user writes the name (.*)$")
    public void theUserWritesTheNameDylan(String text) {
        OnStage.theActorInTheSpotlight().attemptsTo(WritesTheNameDylan.writesTheNameDylan(text));
    }

    @Then("^the user validates the written (.*)$")
    public void theUserValidatesTheWrittenWord(String message) {

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                                ValidatesTheWrittenWord.validatesTheWrittenWord(message), Matchers.is(true))

        );

    }



}
