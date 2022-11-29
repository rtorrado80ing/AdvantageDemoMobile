package co.com.tcs.certification.advantage.interactions;

import co.com.tcs.certification.advantage.userinterface.LoginPageUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginInterection implements Interaction {

    private String user;
    private String password;

    public LoginInterection(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static LoginInterection login(String user, String password){

        return new LoginInterection(user, password);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(LoginPageUserInterface.USER_LOGIN));
        actor.attemptsTo(Enter.theValue(password).into(LoginPageUserInterface.PW_LOGIN));
        actor.attemptsTo(Click.on(LoginPageUserInterface.BUTTON_LOGIN));

    }
}
