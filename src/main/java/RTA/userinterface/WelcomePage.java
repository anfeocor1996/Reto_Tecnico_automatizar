package RTA.userinterface;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/welcome?from=signup")
public class WelcomePage extends PageObject {
    public static final Target NAME_WELCOME=Target.the("WELCOME MESSAGE").located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freela\")]"));
}

