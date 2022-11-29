package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.userinterface.SelectCategoriesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectHeadCateTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SelectCategoriesInterface.SELECT_HEADPHONES_CATE));
    }
    public static Performable selectHeadCate(){
        return instrumented(SelectHeadCateTask.class);
    }
}
