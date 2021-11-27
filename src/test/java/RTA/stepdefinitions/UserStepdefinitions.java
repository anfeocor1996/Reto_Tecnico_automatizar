package RTA.stepdefinitions;

import RTA.models.UtestData;
import RTA.question.Check;
import RTA.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UserStepdefinitions {

    @Before public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^The user enter the Utest page and click on join today$")
    public void theUserEnterTheUtestPageAndClickOnJoinToday(List<UtestData> UtestData) throws Exception {
        OnStage.theActorCalled("user").wasAbleTo(OpenUp.thePage(),(Home.onThePage()));
    }


    @When("^Complete the form$")
    public void completeTheForm(List<UtestData> UtestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(SingUp.onThePage(UtestData.get(0).getStrfirstName(),
                UtestData.get(0).getStrlastname(),UtestData.get(0).getStremail(), UtestData.get(0).getStrmonth(),
                UtestData.get(0).getStrday(),UtestData.get(0).getStryear(),UtestData.get(0).getStrcountry(),
                UtestData.get(0).getStrcity(),UtestData.get(0).getStrpostal(),UtestData.get(0).getStrbrand(),
                UtestData.get(0).getStrmodel(),UtestData.get(0).getStrpassword(),UtestData.get(0).getStros()
                ));

    }

    @Then("^It generated a message of \"([^\"]*)\"$")
    public void itGeneratedAMessageOf(List<UtestData> UtestData) throws Exception  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Check.toThe(UtestData.get(0).getStrwelcomemessage())));
    }
}