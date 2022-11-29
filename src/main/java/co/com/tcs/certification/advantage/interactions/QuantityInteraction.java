package co.com.tcs.certification.advantage.interactions;

import co.com.tcs.certification.advantage.userinterface.QuantityInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class QuantityInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < 2; i++) {
            actor.attemptsTo(
                    Click.on(QuantityInterface.MAX_QUANTITY)
            );
        }
        actor.attemptsTo(Click.on(QuantityInterface.BUTTON_APPLY));
    }
    public static QuantityInteraction quantity(){
        return new QuantityInteraction();
    }
}
