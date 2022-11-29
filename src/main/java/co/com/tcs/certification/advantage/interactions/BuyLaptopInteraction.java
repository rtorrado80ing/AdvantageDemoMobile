package co.com.tcs.certification.advantage.interactions;

import co.com.tcs.certification.advantage.tasks.SelectLaptopsCategTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class BuyLaptopInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectLaptopsCategTask.tabletsCategories(),
                SelectProductInteraction.selectProduct("Laptops"),
                FeatureProductsInteraction.featureProducts("GRAY")
        );
    }
    public static BuyLaptopInteraction buyLaptop(){
        return new BuyLaptopInteraction();
    }
}
