package RTA.task;

import RTA.userinterface.RTAHomePage;
import RTA.userinterface.RTASingUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

public class SingUp implements Task {
    public static SingUp onThePage() {
        return Tasks.instrumented(SingUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Andres").into(RTASingUpPage.FIRST_NAME_INPUT),
                Enter.theValue("Ocaña").into(RTASingUpPage.LAST_NAME_INPUT),
                Enter.theValue("andres.1555@hotmail.com").into(RTASingUpPage.EMAIL_ADDRESS_INPUT),
                Enter.theValue("May").into(RTASingUpPage.MONTH_BD_SELECT),
                Enter.theValue("14").into(RTASingUpPage.DAY_BD_SELECT),
                Enter.theValue("1996").into(RTASingUpPage.YEAR_BD_SELECT),
                Click.on(RTASingUpPage.NEXT_BUTTON),
                Enter.theValue("Colombia").into(RTASingUpPage.COUNTRY_SELECT),
                Enter.theValue("Pasto").into(RTASingUpPage.CITY_INPUT),
                Enter.theValue("52001").into(RTASingUpPage.POSTAL_INPUT),
                Click.on(RTASingUpPage.NEXT_DEVICES),
                Enter.theValue("apple").into(RTASingUpPage.BRAND_SELECT),
                Enter.theValue("iphone12mini").into(RTASingUpPage.MODEL_SELECT),
                Enter.theValue("15.01").into(RTASingUpPage.OS_SELECT),
                Click.on(RTASingUpPage.NEXT_LAST_STEP),
                Enter.theValue("********").into(RTASingUpPage.PASSWORD_INPUT),
                Enter.theValue("********").into(RTASingUpPage.CONFIRM_PASSWORD_INPUT),
                Click.on(RTASingUpPage.TERM_OF_USER_CHECK),
                Click.on(RTASingUpPage.PRIVACY_SETTINGS_CHECK),
                Click.on(RTASingUpPage.COMPLETE_SETUP)


        );

    }
}
