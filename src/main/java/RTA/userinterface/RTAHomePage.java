package RTA.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RTAHomePage extends PageObject {
    public static final Target JOINTODAY_BUTTON=Target.the("button that arrive us the form ").located(By.className("unauthenticated-nav-bar__sign-up"));
}
