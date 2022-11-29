package co.com.tcs.certification.advantage.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SelectCategoriesInterface {
    public static final Target SELECT_LAPTOPS_CATE = Target.the("")
            .locatedBy("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView");
    public static final Target SELECT_HEADPHONES_CATE = Target.the("")
            .locatedBy("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView");
    public static final Target SELECT_TABLET_CATE = Target.the("")
            .locatedBy("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.ImageView");
}
