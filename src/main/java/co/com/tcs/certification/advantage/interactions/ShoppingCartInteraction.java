package co.com.tcs.certification.advantage.interactions;

import co.com.tcs.certification.advantage.userinterface.ShoppingCartInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class ShoppingCartInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingCartInterface.BUTTON_SHOPPING_CART)
        );
    }

    public static ShoppingCartInteraction shoppingCart(){
        return new ShoppingCartInteraction();
    }
}
