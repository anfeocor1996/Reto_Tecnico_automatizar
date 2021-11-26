package RTA.task;

import RTA.userinterface.WelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenWelcome implements Task {
    private WelcomePage welcomePage;
    public static OpenWelcome ThePage(){
        return Tasks.instrumented(OpenWelcome.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
