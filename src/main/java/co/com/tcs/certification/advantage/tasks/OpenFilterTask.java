package co.com.tcs.certification.advantage.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.tcs.certification.advantage.userinterface.ButtonFilterInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OpenFilterTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ButtonFilterInterface.SLIDE_PRICE)
        );
    }
    public static Performable openFilter(){
        return instrumented(OpenFilterTask.class);
    }
}
