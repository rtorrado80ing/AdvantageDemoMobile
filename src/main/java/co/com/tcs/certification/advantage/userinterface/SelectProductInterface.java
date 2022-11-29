package co.com.tcs.certification.advantage.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SelectProductInterface {
    public static final Target SELECT_PRODUCT = Target.the("")
            .locatedBy("//android.widget.RelativeLayout[@content-desc=\"COMODIN\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]");
}
