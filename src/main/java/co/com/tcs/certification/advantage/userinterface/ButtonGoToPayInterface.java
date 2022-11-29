package co.com.tcs.certification.advantage.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ButtonGoToPayInterface {
    public static final Target BUTTON_PAY = Target.the("")
            .located(By.id("buttonCheckOut"));
}
