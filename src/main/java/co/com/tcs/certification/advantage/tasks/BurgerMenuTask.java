package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.userinterface.HomeUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class BurgerMenuTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomeUserInterface.BUTTON_MENU));
    }

    public static BurgerMenuTask buttonClic(){
        return new BurgerMenuTask();
    }
}
