package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.userinterface.ButtonGoToPayInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToPayTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ButtonGoToPayInterface.BUTTON_PAY)
        );
    }
    public static Performable goToPay(){
        return instrumented(GoToPayTask.class);
    }
}
