package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.userinterface.EnterMonthInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterMonthTask implements Task {

    private String month;

    public EnterMonthTask(String month) {
        this.month = month;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EnterMonthInterface.ENTER_MONTH.getCssOrXPathSelector().replace("COMODIN", this.month))
        );
    }
    public static Performable enterMonth(String month){
        return instrumented(EnterMonthTask.class, month);
    }
}
