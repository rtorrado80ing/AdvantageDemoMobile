package co.com.tcs.certification.advantage.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartInterface {
    public static final Target BUTTON_SHOPPING_CART = Target.the("")
            .located(By.id("imageViewCart"));
}
