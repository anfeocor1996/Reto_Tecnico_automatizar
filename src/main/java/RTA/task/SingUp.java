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

    public SingUp(String strfirstName, String strlastname, String stremail, String strmonth, String strday, String stryear, String strcountry, String strcity, String strpostal, String strbrand, String strmodel, String strpassword, String stros) {
        this.strfirstName = strfirstName;
        this.strlastname = strlastname;
        this.stremail = stremail;
        this.strmonth = strmonth;
        this.strday = strday;
        this.stryear = stryear;
        this.strcountry = strcountry;
        this.strcity = strcity;
        this.strpostal = strpostal;
        this.strbrand = strbrand;
        this.strmodel = strmodel;
        this.strpassword = strpassword;
        this.stros = stros;
    }

    private String strfirstName;
    private String strlastname;
    private String stremail;
    private String strmonth;
    private String strday;
    private String stryear;
    private String strcountry;
    private String strcity;
    private String strpostal;
    private String strbrand;
    private String strmodel;
    private String strpassword;
    private String stros;


    public static SingUp onThePage(String strfirstName, String strlastname, String stremail, String strmonth, String strday, String stryear,
                                   String strcountry, String strcity, String strpostal, String strbrand, String strmodel, String strpassword,
                                   String stros) {
        return Tasks.instrumented(SingUp.class,strbrand,strcity,strcountry,strday,stremail,strfirstName,strlastname,
                strmodel,strmonth,strpassword,strpostal,stryear,stros);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strfirstName).into(RTASingUpPage.FIRST_NAME_INPUT),
                Enter.theValue(strlastname).into(RTASingUpPage.LAST_NAME_INPUT),
                Enter.theValue(stremail).into(RTASingUpPage.EMAIL_ADDRESS_INPUT),
                Enter.theValue(strmonth).into(RTASingUpPage.MONTH_BD_SELECT),
                Enter.theValue(strday).into(RTASingUpPage.DAY_BD_SELECT),
                Enter.theValue(stryear).into(RTASingUpPage.YEAR_BD_SELECT),
                Click.on(RTASingUpPage.NEXT_BUTTON),
                Enter.theValue(strcountry).into(RTASingUpPage.COUNTRY_SELECT),
                Enter.theValue(strcity).into(RTASingUpPage.CITY_INPUT),
                Enter.theValue(strpostal).into(RTASingUpPage.POSTAL_INPUT),
                Click.on(RTASingUpPage.NEXT_DEVICES),
                Enter.theValue(strbrand).into(RTASingUpPage.BRAND_SELECT),
                Enter.theValue(strmodel).into(RTASingUpPage.MODEL_SELECT),
                Enter.theValue(stros).into(RTASingUpPage.OS_SELECT),
                Click.on(RTASingUpPage.NEXT_LAST_STEP),
                Enter.theValue(strpassword).into(RTASingUpPage.PASSWORD_INPUT),
                Enter.theValue(strpassword).into(RTASingUpPage.CONFIRM_PASSWORD_INPUT),
                Click.on(RTASingUpPage.TERM_OF_USER_CHECK),
                Click.on(RTASingUpPage.PRIVACY_SETTINGS_CHECK),
                Click.on(RTASingUpPage.COMPLETE_SETUP)


        );

    }
}
