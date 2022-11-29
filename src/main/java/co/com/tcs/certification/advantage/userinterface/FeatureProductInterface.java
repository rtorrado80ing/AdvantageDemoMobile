package co.com.tcs.certification.advantage.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FeatureProductInterface {
    public static final Target  QUANTITY_PRODUCTS = Target.the("")
            .located(By.id("textViewProductQuantity"));
    public static final Target  COLOR_PRODUCT = Target.the("")
            .located(By.id("linearLayoutProductColors"));
    public static final Target  BUTTON_ADD = Target.the("")
            .located(By.id("buttonProductAddToCart"));
    public static final Target  BUTTON_BACK = Target.the("")
            .located(By.id("imageViewBack"));
}
