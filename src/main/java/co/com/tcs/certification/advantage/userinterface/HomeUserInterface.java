package co.com.tcs.certification.advantage.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUserInterface {

    public static final Target BUTTON_MENU = Target.the("Burger Menu")
            .located(By.id("imageViewMenu"));


}
