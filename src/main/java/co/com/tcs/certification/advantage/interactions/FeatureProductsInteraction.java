package co.com.tcs.certification.advantage.interactions;

import co.com.tcs.certification.advantage.userinterface.FeatureProductInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class FeatureProductsInteraction implements Interaction {

    private String color;

    public FeatureProductsInteraction(String color) {
        this.color = color;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FeatureProductInterface.QUANTITY_PRODUCTS),
                QuantityInteraction.quantity(),
                Click.on(FeatureProductInterface.COLOR_PRODUCT),
                ColorInteraction.color(this.color),
                Click.on(FeatureProductInterface.BUTTON_ADD),
                BackInteraction.back()
        );
    }
    public static FeatureProductsInteraction featureProducts(String color){
        return new FeatureProductsInteraction(color);
    }
}
