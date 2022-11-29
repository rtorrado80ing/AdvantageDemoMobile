package co.com.tcs.certification.advantage.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IconLoginUserInterface {

    public static final Target BUTTON_LOGIN = Target.the("Button login")
            .located(By.id("textViewMenuUser"));
    public static final Target BUTTON_HOME = Target.the("Button login")
            .located(By.id("textViewMenuHome"));
}
