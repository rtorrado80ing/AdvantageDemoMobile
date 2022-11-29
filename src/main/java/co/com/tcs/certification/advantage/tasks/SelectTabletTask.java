package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.userinterface.SelectProductInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectTabletTask implements Task {

    private String product;

    public SelectTabletTask(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                OpenFilterTask.openFilter(),
                EnterFilterTask.enterFilter(),
                Click.on(SelectProductInterface.SELECT_PRODUCT.getCssOrXPathSelector()
                        .replace("COMODIN", this.product ))
        );
    }

    public static SelectTabletTask selectTablet(String product){
        return new SelectTabletTask(product);
    }
}
