package co.com.tcs.certification.advantage.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;

import org.openqa.selenium.Keys;

import co.com.tcs.certification.advantage.userinterface.EnterInfoCardInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterInfoCardTask implements Task {

    private String name;
    private String numberCard;
    private String cvv;
    private String month;
    private String year;

    public EnterInfoCardTask(Map<String, String> data) {
        this.name = data.get("CardHolderName");
        this.numberCard = data.get("CardNumber");
        this.cvv = data.get("CVVNumber");
        this.month = data.get("expirationMonth");
        this.year = data.get("expirationYear");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.name).into(EnterInfoCardInterface.CARD_NAME).thenHit(Keys.ENTER),
                Enter.theValue(this.numberCard).into(EnterInfoCardInterface.CARD_NUMBER).thenHit(Keys.ENTER),
                Enter.theValue(this.cvv).into(EnterInfoCardInterface.CVV).thenHit(Keys.ENTER),
                Click.on(EnterInfoCardInterface.EXPE_MONTH),
                EnterMonthTask.enterMonth(this.month),
                Click.on(EnterInfoCardInterface.EXPE_YEAR),
                EnterYearTask.enterYear(this.year),
                Click.on(EnterInfoCardInterface.BUTTON_APPLY)
        );
    }
    public static Performable enterInfoCard(Map<String, String> data){
        return instrumented(EnterInfoCardTask.class, data);
    }
}
