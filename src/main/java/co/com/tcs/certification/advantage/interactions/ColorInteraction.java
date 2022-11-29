package co.com.tcs.certification.advantage.interactions;

import co.com.tcs.certification.advantage.userinterface.ColorProductInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class ColorInteraction implements Interaction {

    private String color;

    public ColorInteraction(String color) {
        this.color = color;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (this.color){
            case "WHITE":
                actor.attemptsTo(
                        Click.on(ColorProductInterface.WHITE_COLOR)
                );
                break;
            case "GRAY":
                actor.attemptsTo(
                        Click.on(ColorProductInterface.GRAY_COLOR)
                );
                break;
            case "BLACK":
                actor.attemptsTo(
                        Click.on(ColorProductInterface.BLACK_COLOR)
                );
                break;
        }
    }
    public static ColorInteraction color(String color){
        return new ColorInteraction(color);
    }
}
