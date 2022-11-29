package co.com.tcs.certification.advantage.interactions;

import co.com.tcs.certification.advantage.userinterface.SelectProductInterface;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class SelectProductInteraction implements Task {

    private String product;

    public SelectProductInteraction(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectProductInterface.SELECT_PRODUCT.getCssOrXPathSelector()
                        .replace("COMODIN", this.product ))
        );
    }

    public static SelectProductInteraction selectProduct(String product){
        return new SelectProductInteraction(product);
    }
}
