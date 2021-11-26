package RTA.question;


import RTA.userinterface.WelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Check implements Question<Boolean> {

    private String question;

    public Check(String question){
        this.question=question;
    }
    public static Check toThe(String question) {
        return new Check(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String messagew=Text.of(WelcomePage.NAME_WELCOME).viewedBy(actor).asString();
        if (question.equals(messagew)) {
            result = true;
        } else {
            result=false;
        }
        return result;
        }

    }

