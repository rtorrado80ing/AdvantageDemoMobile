package co.com.tcs.certification.advantage.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentMethodInterface {
    public static final Target PAYMENT_METHOD = Target.the("")
            .locatedBy("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]");
    public static final Target BUTTON_PAY = Target.the("")
            .located(By.id("buttonPayNow"));

}
