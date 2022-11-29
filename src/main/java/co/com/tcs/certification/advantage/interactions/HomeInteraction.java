package co.com.tcs.certification.advantage.interactions;

import co.com.tcs.certification.advantage.userinterface.IconLoginUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class HomeInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IconLoginUserInterface.BUTTON_HOME)
        );
    }

    public static HomeInteraction home(){
        return new HomeInteraction();
    }
}
