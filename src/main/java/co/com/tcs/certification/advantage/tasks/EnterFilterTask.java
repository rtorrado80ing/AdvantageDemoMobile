package co.com.tcs.certification.advantage.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.tcs.certification.advantage.userinterface.FiltersInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EnterFilterTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FiltersInterface.SLIDE_PRICE),
                Click.on(FiltersInterface.RANGE_PRICE),
                Click.on(FiltersInterface.DISPLAY),
                Click.on(FiltersInterface.SELECT_DISPLAY),
                Click.on(FiltersInterface.PROCESSOR),
                Click.on(FiltersInterface.SELECT_PROCESSOR),
//                Click.on(FiltersInterface.COLOR),
//                Click.on(FiltersInterface.SELECT_COLOR),
                Click.on(FiltersInterface.BUTTON_APPLY)
        );
    }

    public static Performable enterFilter(){
        return instrumented(EnterFilterTask.class);
    }
}
