package RTA.task;

import RTA.userinterface.RTAHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Home implements Task {
    public static Home onThePage() {
        return Tasks.instrumented(Home.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RTAHomePage.JOINTODAY_BUTTON));

    }
}
