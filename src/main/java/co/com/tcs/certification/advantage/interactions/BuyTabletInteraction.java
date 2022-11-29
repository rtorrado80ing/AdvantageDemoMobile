package co.com.tcs.certification.advantage.interactions;

import co.com.tcs.certification.advantage.tasks.SelectTabletCateTask;
import co.com.tcs.certification.advantage.tasks.SelectTabletTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class BuyTabletInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectTabletCateTask.selectTablet(),
                SelectTabletTask.selectTablet("Tablets"),
                FeatureProductsInteraction.featureProducts("BLACK")
        );
    }
    public static BuyTabletInteraction buyTablet(){
        return new BuyTabletInteraction();
    }
}
