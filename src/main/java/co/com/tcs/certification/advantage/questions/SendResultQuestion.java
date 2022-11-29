package co.com.tcs.certification.advantage.questions;

import co.com.tcs.certification.advantage.userinterface.ResultInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SendResultQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return ResultInterface.RESULT.resolveFor(actor).getText();
    }
    public static SendResultQuestion sendResult(){
        return new SendResultQuestion();
    }
}
