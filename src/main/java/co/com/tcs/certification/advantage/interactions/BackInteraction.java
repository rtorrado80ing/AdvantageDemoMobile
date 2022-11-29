package co.com.tcs.certification.advantage.interactions;

import co.com.tcs.certification.advantage.userinterface.FeatureProductInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class BackInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FeatureProductInterface.BUTTON_BACK)
        );
    }

    public static BackInteraction back(){
        return new BackInteraction();
    }
}
