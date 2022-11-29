package co.com.tcs.certification.advantage.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.tcs.certification.advantage.userinterface.EnterYearInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EnterYearTask implements Task {

    private String year;

    public EnterYearTask(String year) {
        this.year = year;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EnterYearInterface.ENTER_YEAR.getCssOrXPathSelector().replace("COMODIN", this.year))
        );
    }

    public static Performable enterYear(String year){
        return instrumented(EnterYearTask.class, year);
    }
}
