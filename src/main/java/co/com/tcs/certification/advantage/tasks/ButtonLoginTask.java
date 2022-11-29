package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.userinterface.IconLoginUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ButtonLoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IconLoginUserInterface.BUTTON_LOGIN));
    }
    public static ButtonLoginTask buttonClic (){
        return new ButtonLoginTask();
    }
}
