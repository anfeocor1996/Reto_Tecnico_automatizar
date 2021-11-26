package RTA.stepdefinitions;

import RTA.question.Check;
import RTA.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UserStepdefinitions {

    @Before public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^The user enter the Utest page and click on join today$")
    public void theUserEnterTheUtestPageAndClickOnJoinToday() {
        OnStage.theActorCalled("user").wasAbleTo(OpenUp.thePage(),(Home.onThePage()));
    }


    @When("^Complete the form$")
    public void completeTheForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(SingUp.onThePage());

    }

    @Then("^It generated a message of \"([^\"]*)\"$")
    public void itGeneratedAMessageOf(String question)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Check.toThe(question)));
    }
}