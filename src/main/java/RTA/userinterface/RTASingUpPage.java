package RTA.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class RTASingUpPage extends PageObject {
    public static final Target FIRST_NAME_INPUT=Target.the("where do we write the first name ").located(By.id("firstName"));

    public static final Target LAST_NAME_INPUT=Target.the("where do we write the last name ").located(By.id("lastName"));

    public static final Target EMAIL_ADDRESS_INPUT=Target.the("where do we write the email address ").located(By.id("email"));

    public static final Target MONTH_BD_SELECT=Target.the("where do we select the month of the birthday ").located(By.id("birthMonth"));

    public static final Target DAY_BD_SELECT=Target.the("where do we select the day of the birthday ").located(By.id("birthDay"));

    public static final Target YEAR_BD_SELECT=Target.the("where do we select the year of the birthday ").located(By.id("birthYear"));

    // public static final Target LANGUAGES_SELECT=Target.the("where do we select the languages ").located(By.id("firstName"));

    public static final Target CITY_INPUT =Target.the("where do we write the city ").located(By.id("city"));

    public static final Target POSTAL_INPUT=Target.the("where do we write the postal ").located(By.id("zip"));

    public static final Target COUNTRY_SELECT = Target.the("where do we select the country ").located(By.xpath("//input[@placeholder='Select a country']"));

    public static final Target BRAND_SELECT = Target.the("where do we select the brand ").located(By.xpath("//input[@placeholder='Select Brand']"));

    public static final Target MODEL_SELECT = Target.the("where do we select the model ").located(By.xpath("//input[@placeholder='Select a Model']"));

    public static final Target OS_SELECT = Target.the("where do we select the os ").located(By.xpath("//input[@placeholder='Select OS']"));

    public static final Target PASSWORD_INPUT=Target.the("where do we write the password ").located(By.id("password"));

    public static final Target CONFIRM_PASSWORD_INPUT=Target.the("where do we write the confirm password ").located(By.id("confirmPassword"));

    public static final Target TERM_OF_USER_CHECK=Target.the("where do we check the term of use ").located(By.id("termOfUse"));

    public static final Target PRIVACY_SETTINGS_CHECK=Target.the("where do we check the privacy settings ").located(By.id("privacySettings"));

    public static final Target NEXT_BUTTON=Target.the("button that arrive us the next location ").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]"));

    public static final Target NEXT_DEVICES=Target.the("button that arrive us the next location ").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/a[1]"));

    public static final Target NEXT_LAST_STEP=Target.the("button that arrive us the next location ").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));

    public static final Target COMPLETE_SETUP=Target.the("button that arrive us the next location ").located(By.id("laddaBtn"));

}
