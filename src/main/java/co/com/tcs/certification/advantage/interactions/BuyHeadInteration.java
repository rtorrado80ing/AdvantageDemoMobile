package co.com.tcs.certification.advantage.interactions;

import co.com.tcs.certification.advantage.tasks.SelectHeadCateTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class BuyHeadInteration implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectHeadCateTask.selectHeadCate(),
                SelectProductInteraction.selectProduct("Headphones"),
                FeatureProductsInteraction.featureProducts("BLACK")
        );
    }
    public static BuyHeadInteration buyHead(){
        return new BuyHeadInteration();
    }
}
